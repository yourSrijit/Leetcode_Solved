class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> leftProduct(n, 1);
        vector<int> rightProduct(n, 1);
        vector<int> result(n, 1);

        // Calculate the product of elements to the left of each element
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }

        // Calculate the product of elements to the right of each element
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }

        // Calculate the final result
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }

        return result;
    }
};
