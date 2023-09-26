class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int minsofar=prices[0];
        int l=prices.length;
        for(int i=0;i<l;i++){
            minsofar =Math.min(minsofar,prices[i]);
           int  profit =prices[i]-minsofar;
             maxProfit =Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}