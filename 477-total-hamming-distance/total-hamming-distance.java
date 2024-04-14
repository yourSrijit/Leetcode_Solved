class Solution {
    // private static int count(int n,int m){
    //     int p=(n^m);
    //     int count=0;
    //     while(p>0){
    //         count += (p&1);
    //         p >>=1;
    //     }
    //     return count;
    // }
    public int totalHammingDistance(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
               sum=sum + Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return sum;
    }
}