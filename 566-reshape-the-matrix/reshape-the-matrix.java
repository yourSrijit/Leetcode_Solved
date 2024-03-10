class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int row=0;
        int col=0;

        if(r*c != m*n){
            return mat;
        }

        int res[][]=new int[r][c];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[row][col]=mat[i][j];
                col++;
                if(col==c){
                    row++;
                    col=0;
                }
            }
        }
        return res;
    }
}