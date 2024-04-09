class Solution {
public:
    int arithmeticTriplets(vector<int>& nums, int diff) {
        map<int,bool> map;
        int count=0;
        for(int i=0;i<nums.size();i++){
            map[nums[i]]=true;
        }
        
        for(int i=0;i<nums.size();i++){
           if(map[nums[i]+diff] && map[nums[i]+diff+diff]){
            count++;
           }
        }
         return count;
    }
};