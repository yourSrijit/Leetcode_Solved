class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int res[]=new int[2];
        for(int num:nums){
            arr[num-1]++;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                res[0]=i+1;
            }
             if(arr[i]==0){
                res[1]=i+1;
            }
        }
        return res;
    }
}