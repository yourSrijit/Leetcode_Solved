class Solution {
    public int minOperations(int[] nums) {
        if(nums.length==1){
            return 0;
        }
     int ans=0;
      for(int i=1;i<nums.length;i++){
        if(nums[i-1]>nums[i]){
            int dif=nums[i-1]-nums[i]+1;
            nums[i]+=dif;
            ans+=dif;
        }
        else if(nums[i-1]==nums[i]){
            nums[i]++;
            ans++;
        }

      }

     return ans;
    }
}