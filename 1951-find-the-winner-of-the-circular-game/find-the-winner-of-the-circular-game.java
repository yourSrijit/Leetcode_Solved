class Solution {
    public int findTheWinner(int n, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            list.add(i);
        }
        
        Iterator<Integer> it = list.iterator();
        while(list.size() > 1) {
            int count = 0;
            while(count < k) {
                if(!it.hasNext()) {
                    it = list.iterator(); // Reset the iterator if it reaches the end of the list
                }
                it.next();
                count++;
            }
            it.remove();
        }
        
        return list.getFirst();
    }
}