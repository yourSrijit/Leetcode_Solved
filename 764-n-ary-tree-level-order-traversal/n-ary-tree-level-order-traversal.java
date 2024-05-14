class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelValues = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                levelValues.add(current.val);
                
                for (Node child : current.children) {
                    queue.offer(child);
                }
            }
            
            result.add(levelValues);
        }
        
        return result;
    }
}
