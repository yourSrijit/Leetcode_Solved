class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=0;
        int minDif=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return target;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }

                int dif=Math.abs(sum-target);
                if(dif<minDif){
                    minDif=dif;
                    ans=sum;
                }
            }
        } 
        return ans;
             
    }
}