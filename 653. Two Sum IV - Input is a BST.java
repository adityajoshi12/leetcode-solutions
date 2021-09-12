class Solution {
    HashSet<Integer> hash;
    public boolean findTarget(TreeNode root, int k) {
        hash=new HashSet();
        return traverse(root,k);
    }
    private boolean traverse(TreeNode root,int target){
        if(root==null) return false;
        if(hash.contains(target-root.val)){ 
		      return true;
		}else{ 
		     hash.add(root.val); 
		}
        return traverse(root.left,target)||traverse(root.right,target);
    }
}
