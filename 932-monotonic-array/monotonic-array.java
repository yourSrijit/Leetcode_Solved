class Solution {
    public boolean isMonotonic(int[] nums) {
     return monoInc(nums)||monoDec(nums);
    }
    public static boolean monoInc(int nums[]){
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) return false;
        }
        return true;
    }
     public static boolean monoDec(int nums[]){
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]) return false;
        }
        return true;
    }
}