class Solution {
     List<Integer> n=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
       
        if(root==null)
            return n;
        n.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return n;
        
    }
}