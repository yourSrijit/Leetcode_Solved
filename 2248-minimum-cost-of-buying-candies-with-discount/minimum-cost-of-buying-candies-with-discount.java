class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
        Arrays.sort(cost);
        int i=n-1,price=0;
        while(i>1){
        price+=cost[i--];
        price+=cost[i--];
        i--;
        }
        while(i>=0){
            price+=cost[i--];
        }
        return price;
    }
}