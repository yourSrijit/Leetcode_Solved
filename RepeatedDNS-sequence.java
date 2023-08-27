class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        List<String> res=new ArrayList<>();
        String ans="";
        int j=10;
        for(int i=0;i<s.length()-10;i++){
            ans=s.substring(i,j);
            map.put(ans,map.getOrDefault(ans,0)+1);
            j++;
        }
        for(Map.Entry<String,Integer>e:map.entrySet()){
            if(e.getValue()>1){
                res.add(e.getKey());
            }
        }
         for(Map.Entry<String,Integer>e:map.entrySet()){
             if(res.isEmpty() && map.size()==1){
            if(e.getValue()==1){
                res.add(e.getKey());
            }
            }
        }
        return res;
    }
}
