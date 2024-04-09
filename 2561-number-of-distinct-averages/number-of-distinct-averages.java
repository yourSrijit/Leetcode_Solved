class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> set=new HashSet<>();
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            double avg=(nums[i]+nums[j])/2.0;
            set.add(avg);
            i++;
            j--;
        }
        
        return set.size();
    }
}