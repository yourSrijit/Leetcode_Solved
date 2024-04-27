class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        Arrays.fill(res,-1);
        if(nums.length==0){
          return res;
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && j==0){
                res[j]=i;
                j++;
            }
            if(nums[i]==target && j==1){
                res[j]=i;
            }

        }
        if(res[0]!=-1 && res[1]!=-1){
            return res;
        }
        else{
       Arrays.fill(res,-1);
       return res;
        }
        
    }
}