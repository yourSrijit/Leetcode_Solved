class Solution {
    public int titleToNumber(String str) {
        int res=0,len=str.length();
        for(int i=0;i<=len-1;i++){
            res*=26;
            res+=(str.charAt(i)-'A'+1);
        }
        return res;
    }
}