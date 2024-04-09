class Solution {
public:
    int distinctAverages(vector<int>& nums) {
        set<double>set;
        int n=nums.size();
        sort(nums.begin(),nums.end());
        int i=0,j=n-1;
        while(i<j){
            double avg=(nums[i]+nums[j])/2.0;
            set.insert(avg);
            j--;
            i++;
        }
        return set.size();
    }
};