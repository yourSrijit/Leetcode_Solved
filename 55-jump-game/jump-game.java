class Solution {
    public boolean canJump(int[] nums) {
        int finalPosition=nums.length-1;
        int l=nums.length;
        for(int i=l-1;i>=0;i--){ 
            if(i+nums[i]>=finalPosition){
                finalPosition=i;
            }
        }
        
        return finalPosition==0;
    }
}