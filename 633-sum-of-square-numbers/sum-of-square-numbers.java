class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<0){
            return false;
        }
        long h=(int)Math.sqrt(c);
        long l=0;
        while(l<=h){
            long sum=l*l +h*h;
            if(sum==c){
                return true;
            }
            else if(sum<c){
                l++;
            }
            else{
                h--;
            }
            
        }
        return false;
    }
}