class Solution {
    public static int Solve(int n,int dp[]){
        if(n<=1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans=0;
        for(int i=1;i<=n;i++)
         ans+=Solve(i-1,dp)*Solve(n-i,dp);
        dp[n]=ans;
        return dp[n];
    }
    public int numTrees(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return Solve(n,dp);
    }
}