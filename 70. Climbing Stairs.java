class Solution {
    public int climbStairs(int n) {
        
        return count(n, new int[n+1]);
    }
    
    public int count(int n, int[] qb){
        
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }
        
        if(qb[n]>0){
            return qb[n];
        }
        int n1=count(n-1,qb);
        int n2=count(n-2,qb);
        
        qb[n]=n1+n2;
        
        return n1+n2;
        
        
    }
}