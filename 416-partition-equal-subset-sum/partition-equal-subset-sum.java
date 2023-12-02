class Solution {
        public static boolean isSum(int arr[],int tar){
        int n=arr.length;
        boolean dp[][]=new boolean[n+1][tar+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=tar;j++){
                int cur=arr[i-1];
                if(cur<=j){
                    dp[i][j]=dp[i-1][j-cur] ||dp[i-1][j] ;
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][tar];
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        return isSum(nums,sum/2); 
    }
}