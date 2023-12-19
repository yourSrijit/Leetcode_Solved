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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList();
        findPathsum( root, targetSum,new ArrayList(),res);
        return res;
    }
    public static void findPathsum(TreeNode root,int tar,List<Integer>path, List<List<Integer>> res){
        if(root==null){
            return ;
        }
        path.add(root.val);
        if(root.left==null && root.right==null && tar==root.val){
            res.add(new ArrayList(path));
        }
        findPathsum(root.left,tar-root.val,path,res);
        findPathsum(root.right,tar-root.val,path,res);
        path.remove(path.size()-1);
    }
    
}