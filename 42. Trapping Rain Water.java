class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        
        
        int i=0;
        int j=n-1;
        
        int max_l=Integer.MIN_VALUE;
         int max_r=Integer.MIN_VALUE;
        
        while(i<n&& j>=0){
            max_l=Math.max(max_l,height[i]);
            
            left[i]=max_l;
            
            
            max_r=Math.max(max_r,height[j]);
            
            right[j]=max_r;
            
            i++;
            j--;
        }
        
        int total=0;
        for(i=0;i<n;i++){
            
            total+=Math.min(left[i],right[i])-height[i];
            
        }
        return total;
    }
}