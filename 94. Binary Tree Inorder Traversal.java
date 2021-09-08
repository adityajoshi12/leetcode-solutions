class Solution {
    List<Integer> op=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return op;
        inorderTraversal(root.left);
        op.add(root.val);
        inorderTraversal(root.right);
        return op;
    }
}