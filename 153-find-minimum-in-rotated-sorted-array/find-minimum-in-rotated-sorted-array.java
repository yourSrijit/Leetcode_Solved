class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] < nums[right]) {
                // The minimum element is in the left half, including mid
                right = mid;
            } else {
                // The minimum element is in the right half, excluding mid
                left = mid + 1;
            }
        }
        
        // When the loop ends, left will be pointing to the minimum element
        return nums[left];
    }
}
