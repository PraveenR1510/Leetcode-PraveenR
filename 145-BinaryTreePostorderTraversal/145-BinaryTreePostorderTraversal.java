// Last updated: 8/12/2026, 9:32:57 PM
class Solution {
    List<Integer> l=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return l;
    }
    void postOrder(TreeNode root){
        if(root==null)
        return;
        postOrder(root.left);
        postOrder(root.right);
        l.add(root.val);
    }
}