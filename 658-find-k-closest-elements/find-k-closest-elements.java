class Solution {
    public static List<Integer> twoPointer(int[] arr, int k, int x){
        ArrayList<Integer> ans=new ArrayList<>();
        int l=0,h=arr.length-1;
        while(h-l>=k){
            if(x-arr[l]>arr[h]-x){
                l++;
            }
            else{
                h--;
            }
        }
        for(int i=l;i<=h;i++){
        ans.add(arr[i]);
        }
        return ans;
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        return twoPointer(arr,k,x);
    }
}