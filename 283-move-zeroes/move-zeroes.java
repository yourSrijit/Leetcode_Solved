class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int z=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==0){
                z++;
                }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!= 0){
                nums[j++]=nums[i];
            }
        }  
        while(z!=0){
            nums[j++]=0;
            z--;
        }      
        
    }
}