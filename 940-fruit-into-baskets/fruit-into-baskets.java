class Solution {
    public int totalFruit(int[] fruits) {
        int i=0;
        int j=0;
        int n= fruits.length;
        int ans=0;
        Map<Integer,Integer> map= new HashMap<>();
        if(fruits.length==1) return 1;
        
        while(j<n){
             if(map.containsKey(fruits[j])){
                 map.put(fruits[j],map.get(fruits[j])+1);
             }
             else{
                 map.put(fruits[j],1);
             }
             //
             if(map.size()<=2){
                 ans= Math.max(ans,j-i+1);
                 j++;
             }
             else if(map.size()>2){
                 while(map.size()>2){
                     int val= map.get(fruits[i]);
                     val=val-1;
                     if(val==0){
                         map.remove(fruits[i]);
                     }
                     else{
                         map.put(fruits[i],val);
                     }
                     i++;
                 }
                 if(map.size()==2){
                     ans= Math.max(ans,j-i+1);
                     j++;
                 }
                
             }
        }
        return ans;
    }
}