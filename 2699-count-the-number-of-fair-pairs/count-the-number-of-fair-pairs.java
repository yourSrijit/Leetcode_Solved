class Solution {
    public static long countPair(int nums[],int target){
        long count=0;
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int sum=nums[l] + nums[h];
            if(sum<=target){
                count+=h-l;
                l++;
            }
            else{
                h--;
            }
        }
        return count;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countPair(nums,upper) - countPair(nums,lower-1);
    }
}