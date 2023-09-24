class Solution {
    public static int getVal(char s){
        switch(s){
       case 'I': return 1;
       case 'V': return 5;
       case 'X': return 10;
       case 'L': return 50;
       case 'C': return 100;
       case 'D': return 500;
       case 'M': return 1000;
       default : return 0;
        }
    }
    public int romanToInt(String s) {
        int l=s.length();
        int sum=0;
        for(int i=0;i<l;i++){
            char cur=s.charAt(i);
            if((i+1)<l && getVal(cur)< getVal(s.charAt(i+1))){
                sum-=getVal(cur);
            }
            else{
               sum+=getVal(cur);
            }
        }
        return sum;
    }
}