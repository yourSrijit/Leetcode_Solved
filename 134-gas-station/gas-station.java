class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasHave=0,gasNeed=0;
        int start=0;
        int n=gas.length,cur=0;
        for(int i=0;i<n;i++){
            gasHave+=gas[i];
        }
        for(int cos:cost){
            gasNeed+=cos;
        }
        if(gasHave<gasNeed){
            return -1;
        }
        for(int i=0;i<n;i++){
        cur+=gas[i]-cost[i];
        if(cur<0){
            cur=0;
            start=i+1;
        }
        }
        return start;
    }
}