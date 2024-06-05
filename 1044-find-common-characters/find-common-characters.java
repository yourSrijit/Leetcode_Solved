class Solution {
    private static int[] find(String str){
        int arr[]=new int[26];
        for(char s:str.toCharArray()){
            arr[s-'a']++;
        }
        return arr;
    }
    private static int[] intersection(int[] a,int[] b){
        int arr[]=new int[26];
        for(int i=0;i<26;i++){
            arr[i]=Math.min(a[i],b[i]);
        }
        return arr;
    }
    public List<String> commonChars(String[] words) {
        int arr[]=find(words[0]);
        for(int i=1;i<words.length;i++){
            arr=intersection(arr,find(words[i]));
        }
        List<String> ans=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                char a=(char)(i+'a');
                String b=String.valueOf(a);
                while(arr[i]!=0){
                    ans.add(b);
                    arr[i]--;
                }
            }
        }
        return ans;
    }
}