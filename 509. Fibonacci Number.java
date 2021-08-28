class Solution {
    public int fib(int n) {
        
        int[] a=new int[n+1];
        return fibo(n,a);
        
    }
    public int fibo(int n,int[] arr){
        
        if(n==0|| n==1){
            return n;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        int one=fibo(n-1,arr);
        int two=fibo(n-2,arr);
        arr[n]=one+two;
        return one+two;
    }
}