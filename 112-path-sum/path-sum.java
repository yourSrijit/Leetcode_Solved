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
    public boolean rootToLeafSum(TreeNode root,int target,int sum){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            sum=sum+root.val;
            return target==sum;
        }
        return rootToLeafSum(root.left,target,sum+root.val)|| rootToLeafSum(root.right,target,sum+root.val);

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        return rootToLeafSum(root,targetSum,sum);
    }
}