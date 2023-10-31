class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int a = arr.length;
        int b = arr[0].length;
        int dp[][]=new int[a][b];
        if(arr[0][0] == 0)    
                dp[0][0] = 1;
            else dp[0][0] = 0;
        
        for(int i=1;i<a;i++) {
            if(arr[i][0] == 0 )    
                dp[i][0] = dp[i-1][0];
            else dp[i][0] = 0;
        }    

        for(int i=1;i<b;i++) {
            if(arr[0][i]  == 0)    
                dp[0][i] = dp[0][i-1];
            else dp[0][i] = 0;
        }
        for(int i=1;i<a;i++)
        {
            for(int j=1;j<b;j++)
            {
               if(arr[i][j] == 0)
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                else dp[i][j]=0;
            }
        }
        return dp[a-1][b-1];
    }
}