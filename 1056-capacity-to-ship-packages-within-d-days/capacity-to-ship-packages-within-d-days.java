class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxCap=0;
        int minCap=0;
        for(int w:weights){
            minCap=Math.max(minCap,w);
            maxCap+=w;
        }
        while(minCap< maxCap){
            int mid=minCap+(maxCap-minCap)/2;
            int day=1;
            int sum=0;
            for(int w:weights){
                if(sum+w >mid){
                    day++;
                    sum=0;
                }
                sum+=w;
            }
            if(day >days){
                minCap=mid+1;
            }
            else{
                maxCap=mid;
            }
        }
        return minCap;
    }
}
// https://youtu.be/f2qf4u_O2QE?si=GcW8BjX9bqnnCUig 