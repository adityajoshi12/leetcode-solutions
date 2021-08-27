class Solution {
    public int minSubArrayLen(int target, int[] nums) { 
        int left=0;
        int n=nums.length;
        int sum=0;
        
        int result=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            
            sum+=nums[i];
            
            while(sum>=target){
                result=Math.min(result,i+1-left);
                sum-=nums[left];
                left++;
            }
           
        
        }
        return result!=Integer.MAX_VALUE?result:0;
    }
}