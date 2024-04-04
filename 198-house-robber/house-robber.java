// class Solution {
//     public int rob(int[] nums) {
//         if(nums.length<2){
//             return nums[0];
//         }
//         //dp array initilization
//         int dp[]=new int[nums.length];
        
//         //dp value initilize
//         dp[0]=nums[0];
//         dp[1]=Math.max(nums[0],nums[1]);

//         for(int i=2;i<nums.length;i++){
//             dp[i]=Math.max(nums[i-2]+nums[i],nums[i-1]);
//         }
//         return dp[nums.length-1];
//     }
// }
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        
        return dp[nums.length - 1];
    }
}
