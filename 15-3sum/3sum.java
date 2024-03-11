class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int target=0;
         Set<List<Integer>> set=new HashSet<>();
         List<List<Integer>> ans =new ArrayList<>();
         for(int i=0;i<l;i++){
             int j=i+1;
             int k=l-1;
             while(j<k){
                 int sum=nums[i] +nums[j]+nums[k];
                 if(sum==target){
                     set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                     j++;
                     k--;
                }
                else if(sum>target){
                    k--;
                }
                else{
                    j++;
                }


            }
         }
         ans.addAll(set);
         return ans;
        
    }
}