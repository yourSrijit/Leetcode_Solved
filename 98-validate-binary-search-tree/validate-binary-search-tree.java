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
    public static boolean isValid(TreeNode root,TreeNode max,TreeNode min){
        if(root==null){
            return true;
        }

        if(max!=null && root.val>=max.val){
            return false;
        }
        else if(min!=null && root.val<=min.val){
            return false;
        }
        return isValid(root.left,root,min) && isValid(root.right,max,root);
    }
    public boolean isValidBST(TreeNode root) {
        return isValid(root,null,null);
    }
}