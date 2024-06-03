class Solution {
    public int maximumProduct(int[] nums, int k) {
        int mod=1000000007;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums){
             pq.offer(num);
        }
        while(k>0){
            int min=pq.remove();
            min++;
            k--;
            pq.offer(min);
        }
        long ans=1;
        while(!pq.isEmpty()){
            ans*=pq.poll();
            ans%=mod;
        }
        return (int)ans;        
    }
}