class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ans=set.size();
        int j=0;
        for(int num:set){
           nums[j]=num;
           j++;
        }
        return ans;
        
    }
}