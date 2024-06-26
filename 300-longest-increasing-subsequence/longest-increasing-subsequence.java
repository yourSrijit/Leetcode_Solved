class Solution {
    public static int lcs(int arr1[],int arr2[]){
        int m=arr1.length;
        int n=arr2.length;
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(arr1[i-1]==arr2[j-1]){
                   dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public int lengthOfLIS(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int num1[]=new int[set.size()];
        int i=0;
        for(int n:set){
            num1[i++]=n;
        }
        Arrays.sort(num1);
        return lcs(nums,num1);
    }
}
// https://youtu.be/Xq3hlMvhrkE?si=VUIU3MOOIvspkwYF take help