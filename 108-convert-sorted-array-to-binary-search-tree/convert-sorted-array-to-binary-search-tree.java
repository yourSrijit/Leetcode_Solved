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
    public static TreeNode BST(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=BST(arr,st,mid-1);
        root.right=BST( arr,mid+1,end);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return BST(nums,0,nums.length-1);
    }
}