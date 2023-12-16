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
    int mindif=Integer.MAX_VALUE;
    Integer prev=null;
    public int getMinimumDifference(TreeNode root) {
        if(root==null) return mindif;
        //Left
        getMinimumDifference(root.left);

        // Process
        if(prev!=null){
            mindif=Math.min(mindif,root.val-prev);
        }
        if(root!=null){
            prev=root.val;
        }
        getMinimumDifference(root.right);
        return mindif;
    }
}