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
import java.util.HashSet;
import java.util.Set;

class Solution {
    // Helper method to traverse the tree and add values to a set
    public static void travers(TreeNode root, Set<Integer> set) {
        if (root == null) {
            return;
        }
        travers(root.left, set);
        set.add(root.val);
        travers(root.right, set);
    }
    
    // Method to find if there exist two elements in the BST that sum up to k
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        travers(root, set);
        
        // Iterate through the set to check if the required pair exists
        for (int num : set) {
            int complement = k - num;
            // Ensure the two numbers are distinct
            if (complement != num && set.contains(complement)) {
                return true;
            }
        }
        
        return false;
    }
}
