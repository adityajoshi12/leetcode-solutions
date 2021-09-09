class Solution {
    public double myPow(double x, int n) {
        
      if(n == 0) return 1;
        int temp = Math.abs(n);
        if(n > 0) return solve(x, temp);     
        
        return 1 / solve(x, temp);
    }
    
    double solve(double x, int n){
        if(n == 0) return 1;
        if(x == 0) return 0;
                        
        double sans = solve(x * x, n / 2);
        if(n % 2 == 0) return sans;
        
        return sans * x;
    }
}