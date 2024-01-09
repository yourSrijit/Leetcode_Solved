/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return list; // Check if the root is null
        
        q.add(root);
        
        while (!q.isEmpty()) {
            int n = q.size();
            double sum = 0;
            
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll(); // Retrieve the front of the queue
                sum += node.val;
                
                // Check and enqueue left and right children
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            list.add(sum / n); // Calculate average for the current level
        }
        return list;
    }
}