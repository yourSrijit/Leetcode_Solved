class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        for(int num:stones){
            q.add(num);
        }

        while(q.size()>1){
            int a=q.poll();
            int b=q.poll();
            int c=a-b;
            if(c!=0){
                q.add(c);
            }

        }
       
        return q.isEmpty() ? 0 : q.poll();
    }
}