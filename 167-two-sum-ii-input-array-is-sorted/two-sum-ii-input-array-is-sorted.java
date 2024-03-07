class Solution {
    public int[] twoSum(int[] arr, int tar) {
        int l=0;
        int h=arr.length-1;
        int ans[]=new int[2];
        while(l<h){
            if(arr[l]+arr[h]>tar){
                h--;
            }
            else if(arr[l]+arr[h]<tar){
                l++;
            }
            else{
                ans[0]=l+1;
                ans[1]=h+1;
                return ans;
            }
        }
        return ans;
    }
}