class Solution {
    private static int findLoot(int arr[]){
        if(arr.length<2){
            return arr[0];
        }
        int dp[]=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        
         for(int i = 2; i < arr.length; i++){
        dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
    }
        return dp[arr.length-1];
    }
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int n=nums.length;
        int skipFirst[]=new int[n-1];
        int skipLast[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            skipFirst[i]=nums[i+1];
            skipLast[i]=nums[i];
        }
        int a=findLoot(skipFirst);
        int b=findLoot(skipLast);
        return Math.max(a,b);        
    }
}