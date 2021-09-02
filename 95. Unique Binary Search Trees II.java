class Solution {
    public List<TreeNode> generateTrees(int n) {
            if(n==0){
            return new ArrayList<>();
        }
        List<TreeNode> lis=constructTrees(1,n);
        return lis;
    }
    public List<TreeNode> constructTrees(int start,int end){
        List<TreeNode> lis=new ArrayList<TreeNode>();
        if(start>end){
            lis.add(null);
            return lis;
        }
    for(int i=start;i<=end;i++){
        List<TreeNode> left_sub=constructTrees(start,i-1);
        List<TreeNode> right_sub=constructTrees(i+1,end);
        for(int j=0;j<left_sub.size();j++){
            TreeNode left=left_sub.get(j);
            for(int k=0;k<right_sub.size();k++){
                TreeNode right=right_sub.get(k);
                TreeNode node=new TreeNode(i);
                node.left=left;
                node.right=right;
                lis.add(node);
            }
        }
    }
        return lis;
}
}