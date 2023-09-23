class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int j=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>=2){
                nums[j++]=e.getKey();
                nums[j++]=e.getKey();
            }
            else{
               nums[j++]=e.getKey();
            }

        }
        return j;
        
    }
}