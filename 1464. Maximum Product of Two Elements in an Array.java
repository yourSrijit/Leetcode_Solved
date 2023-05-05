class Solution {
    PriorityQueue<Integer> pq =new PriorityQueue<>(Comparator.reverseOrder());
    public int maxProduct(int[] nums) {
        for(int x : nums){
          pq.add(x);
        }
        int  a=pq.peek()-1;
        pq.remove();
        int b=pq.peek()-1;
        return a*b;
    }
}
