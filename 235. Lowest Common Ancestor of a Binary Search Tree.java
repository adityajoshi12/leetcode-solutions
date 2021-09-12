class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(Math.min(p.val, q.val) <= root.val && Math.max(p.val, q.val) >= root.val) return root;
        return lowestCommonAncestor(root.val > Math.max(p.val, q.val) ? root.left : root.right, p, q);
    }
}
