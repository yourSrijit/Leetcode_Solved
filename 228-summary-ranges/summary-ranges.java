class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        int n=nums.length;
        if(n==0) return ans;

        for(int i=0;i<n;){
            int start=i,end=i;
            while(end+1 < n && nums[end+1]==nums[end]+1) end++;
            
            if(end > start){
                ans.add(nums[start]+"->"+nums[end]);
            }
            else{
                ans.add(nums[start]+"");
            }
            i=end+1;
        }
        return ans;
    }
}