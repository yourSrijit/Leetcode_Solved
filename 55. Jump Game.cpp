class Solution {
public:
    bool canJump(vector<int>& nums) {
        int currentnbr = nums[0];
        if ((currentnbr == 0) && nums.size()>1) return false;
        for (int i = 1; i <nums.size(); i++){
            if (nums[i] == nums.size()-i-1) return true;
            currentnbr = max(currentnbr-1, nums[i]);
            if ((currentnbr<=0) && i!=nums.size()-1) return false;    
        }
        return true;
    }
};
