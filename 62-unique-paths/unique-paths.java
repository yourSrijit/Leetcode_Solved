class Solution {
    // public static int gridWay(int i,int j,int n,int m){
    //     //Base case
    //     if(i==n-1 && j==m-1){
    //         return 1;
    //     }
    //     else if(i==n || j==m){
    //         return 0;
    //     }

    //     //Recursive ciode
    //     int way1=gridWay(i+1,j,n,m);
    //     int way2=gridWay(i,j+1,n,m);
    //     return way1+way2;
    // }


    public int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];
        
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                if(i == 0 || j == 0){
                    dp[i][j] = 1;
                }
                else{
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[n - 1][m - 1];
    }
}
