class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int current=0;
            for(int j=0;j<accounts[i].length;j++){
                current+=accounts[i][j];
            }
            if(current>max) max=current;
        }
        return max;
    }
}