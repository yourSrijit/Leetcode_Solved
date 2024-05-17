class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(!set.contains(e.getValue())){
               set.add(e.getValue());
            }
            else{
                return false;
            }
        }
        return true;
    }
}