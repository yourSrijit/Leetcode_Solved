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
    private int[] travel(TreeNode root){
        if(root==null){
            return new int[2];
        }
        //will store includig in the 0 index and excluding in the index 1
        int [] leftNode=travel(root.left);
        int [] rightNode=travel(root.right);
        int ans[]=new int[2];

        ///Now store the values
        ans[0]=root.val + leftNode[1] +rightNode[1];
        ans[1]=Math.max(leftNode[0],leftNode[1]) +Math.max(rightNode[0],rightNode[1]);
        return ans;
    }
    public int rob(TreeNode root) {
        int ans[]=travel(root);
        return Math.max(ans[0],ans[1]);        
    } 
}