public class Solution {
    // you need treat n as an unsigned value
    public static boolean isSet(int k,int n){
      if((1<<(k-1)&n)!=0) return true;
      return false;
    }
    public int reverseBits(int n) {
        int ans=0;
        for(int i=1;i<=32;i++){
           if(isSet(i,n)){
               ans=((1<<(32-i))| ans);
           }
        }
         return ans;
    }
   
}