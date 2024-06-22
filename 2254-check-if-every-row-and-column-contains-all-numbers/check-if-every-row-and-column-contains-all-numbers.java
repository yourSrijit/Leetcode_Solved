class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=0;j<n;j++){
                if(set.contains(matrix[i][j])){
                    return false;
                }
                else{
                    set.add(matrix[i][j]);
                }
            }
        }

          for(int i=0;i<n;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=0;j<n;j++){
                if(set.contains(matrix[j][i])){
                    return false;
                }
                else{
                    set.add(matrix[j][i]);
                }
            }
        }
        return true;
    }
}