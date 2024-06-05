class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    List<List<Integer>> ans=new ArrayList<>();
    Arrays.sort(arr);
    int min=Integer.MAX_VALUE;
    int dif=0;
    for(int i=0;i<arr.length-1;i++){
       dif=arr[i+1]-arr[i];
       if(dif <min){
        min=dif;
        ans.clear();
        ans.add(Arrays.asList(arr[i],arr[i+1]));
       }
       else if(dif==min){ 
        ans.add(Arrays.asList(arr[i],arr[i+1]));
       }
    }
        
        return ans;
    }
}