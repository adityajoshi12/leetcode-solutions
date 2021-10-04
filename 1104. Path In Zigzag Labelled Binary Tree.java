class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        
        int llv=1;
        int curVal=0;
        while(curVal<label){
            curVal+=llv;
            llv*=2;
        }
        llv/=2;
        
        List<Integer> ans=new ArrayList<>();
        while(label!=1){
        ans.add(label);
            int comp=3*llv-label-1;
            int par=comp/2;
            label=par;
            llv/=2;
        }
        ans.add(1);
        Collections.reverse(ans);
        return ans;
    }
}
