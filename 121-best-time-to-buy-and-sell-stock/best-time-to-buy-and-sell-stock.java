class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int minSofar=prices[0];
        for(int i=0;i<prices.length;i++){
            minSofar=Math.min(minSofar,prices[i]);
            int profit=prices[i]-minSofar;
            max=Math.max(max,profit);
        }
        return max;        
    }
}