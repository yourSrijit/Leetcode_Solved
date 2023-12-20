class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int maxSofar=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
            max=Math.min(height[start],height[end])*(end-start);
            maxSofar=Math.max(max,maxSofar);
            if(Math.min(height[start],height[end])==height[start]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxSofar;
    
    }
}