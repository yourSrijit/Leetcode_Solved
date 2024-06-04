class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
        int n = nums.length;
        Arrays.sort(nums, Comparator.comparingInt(o -> o[1]));
        int last = nums[0][1];
        int count = 1;
        for(int i = 1; i < n; i++){
            if(nums[i][0] >= last){
                count++;
                last = nums[i][1];
            }
        }
        return n - count;
    }
}