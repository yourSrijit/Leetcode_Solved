class Solution {
    public static void dfs(int [][]arr,int i,int j,int col,int start){
        if(i< 0 || j<0 || i>= arr.length || j>=arr[0].length || arr[i][j] !=start || arr[i][j]==col) return;

        arr[i][j]=col;
        dfs(arr,i-1,j,col,start);
        dfs(arr,i+1,j,col,start);
        dfs(arr,i,j-1,col,start);
        dfs(arr,i,j+1,col,start);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int start=image[sr][sc];
            dfs(image,sr,sc,color,start);
        
        return image;
    }
}