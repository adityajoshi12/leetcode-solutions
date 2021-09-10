class Solution {
    public boolean hasPathSum(TreeNode node, int sum) {
          boolean ans = false;
        if (node==null) return ans;
      int subsum = sum - node.val;
      
        if(subsum==0 && node.left==null && node.right==null) return true;
        
        if(node.left!=null) ans=ans || hasPathSum(node.left,subsum);
        
        if(node.right!=null) ans=ans || hasPathSum(node.right,subsum);
        
        return ans;
    }
}
