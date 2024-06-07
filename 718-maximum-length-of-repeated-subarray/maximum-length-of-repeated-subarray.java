class Solution {
    public int findLength(int[] arr1, int[] arr2) {
        int m=arr1.length;
        int n=arr2.length;
        int dp[][]=new int[m+1][n+1];

        int max=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=0;
                }
                max=Math.max(dp[i][j],max);
            }

        }
        return max;
    }
}