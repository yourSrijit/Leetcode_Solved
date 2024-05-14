/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val; 
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public static void preOrder(List<Integer>list,Node root){

        if(root==null){
            return;
        }
        list.add(root.val);
        for(int i=0;i<root.children.size();i++){
            preOrder(list,root.children.get(i));
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> list=new ArrayList<>();
        preOrder(list,root);
        return list;        
    }
}