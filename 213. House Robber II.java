class Solution {
public:

    int houseRobberOne(vector<int>& arr) {
        int N = arr.size();
        if (N == 1) return arr[0];
        vector<int> dp(N, 0);
        dp[0] = arr[0];
        dp[1] = max(arr[0], arr[1]);
        for(int i = 2; i < N; i++){
            dp[i] = max(dp[i-1], dp[i-2] + arr[i]);
        }
        return dp[N-1];
    }

    int rob(vector<int>& nums) {
        int N = nums.size();
        if (N == 1) return nums[0];
        vector<int> v1(nums.begin() + 1, nums.end());
        vector<int> v2(nums.begin(), nums.end() - 1);
        return max(houseRobberOne(v1), houseRobberOne(v2));
    }
};

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed.
All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile,
adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
  Example 1:

Input: nums = [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
Example 2:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
