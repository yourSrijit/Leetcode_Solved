// class Solution {
//     public int findPeakElement(int[] nums) {
//         if(nums.length==1) return 0;
//         int end=nums.length-1;
//         int start=0;
//         int max=nums[start];
//         int index=0;
//         while(start<end){
//             if(nums[start]<=nums[end]){
//                 if(nums[end]>=max){
//                     max=nums[end];
//                     index=end;
//                 }
//                 start++;
//             }
//             else{
//                 if(nums[start]>=max){
//                     max=nums[start];
//                     index=start;
//                 }
//                 end--;
//             }
//         }
//         return index;
//     }
// }


class Solution {
    public int findPeakElement(int[] nums) {
        // if length is 1
        if(nums.length== 1)
            return 0;
        int max= Integer.MIN_VALUE;
        int index= Integer.MIN_VALUE;

        // Finding MAX element and INDEX
        for(int i= 0; i< nums.length; i++){
            if(max< nums[i]){
                max= nums[i];
                index= i;
            }
        }

        return index;
    }
}