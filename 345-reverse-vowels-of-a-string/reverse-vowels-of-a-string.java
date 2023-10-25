class Solution {
    public static boolean isVowel(char s){
        if(s=='a' ||s=='e' || s=='i' || s=='o' ||s=='u' || s=='A' ||s=='E' || s=='I' || s=='O' ||s=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int l=0;
        int h=s.length()-1;
        char arr[]=s.toCharArray();
        while(l<h){
            if(isVowel(arr[l]) && isVowel(arr[h])){
                char temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
                l++;
                h--;
            }
            else if(!isVowel(arr[l])){
                l++;
            }
            else if(!isVowel(arr[h])){
                h--;
            }
        }
        return new String(arr);
    }
}