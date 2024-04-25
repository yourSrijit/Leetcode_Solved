import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        int[] arr = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(hm.containsKey(complement) && hm.get(complement) != i) {
                arr[0] = i;
                arr[1] = hm.get(complement);
                break;
            }
        }
        
        return arr;
    }
}