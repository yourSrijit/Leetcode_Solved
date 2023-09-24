class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int n=nums.length;
        int i=0;
        for(int num:nums){
            if(num==val){
                count++;
            }else{
                nums[i]=num;
                i++;
            }
        }
    return n-count;
    }
}