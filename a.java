 public static int LargButMinFreq(int arr[], int n) {
       HashMap<Integer, Integer> hm = new HashMap<>();
       for(int i : arr){
               hm.put(i, hm.getOrDefault(i, 0)+1);
       }
       int min = (int)1e9;
       int res = -1;
       for(int i : arr){
           if(hm.containsKey(i)){
               if(hm.get(i) == min){
                   res = Math.max(res, i);
               }else if(hm.get(i) < min){
                   min = hm.get(i);
                   res = i;
               }
               hm.remove(i);
           }
       }
       return res;
    }
