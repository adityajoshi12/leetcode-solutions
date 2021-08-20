class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar=prices[0];
        int maxProfit=0;
        
        for(int i=0;i<prices.length;i++){
           minSoFar=Math.min(prices[i],minSoFar);
           maxProfit=Math.max(prices[i]-minSoFar,maxProfit);    
        }
        return maxProfit; 
    }
}