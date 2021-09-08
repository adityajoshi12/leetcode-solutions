class Solution {
    List<Integer> n=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root==null) return n;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        n.add(root.val);
        return n;
    }
}