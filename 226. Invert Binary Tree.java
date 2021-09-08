class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root==null) return root;
        
        
        swap(root);
        
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    
    public void swap(TreeNode root){
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
}