class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[2];
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int k=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1){
             ans[k++]=e.getKey();
            }
        }
      return ans;
        
    }
}