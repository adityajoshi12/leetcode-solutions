class Solution {
    public boolean isValidBST(TreeNode root) {
        int min=1; int max=10000;
       
       return check(root,null,null);
        
        
    }
     public boolean check(TreeNode root, Integer min,Integer max){
         if(root==null){
            return true;
        }
         else if(min!=null && root.val<=min || max!=null && root.val>=max)
        { return false;}
         else 
           {  return check(root.left ,min,root.val) &&   check(root.right, root.val,max) ;}
     }
    
}
