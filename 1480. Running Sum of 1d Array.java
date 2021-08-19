class Solution {
    public int[] runningSum(int[] nums) {
        int current=0;
        for(int i=0;i<nums.length;i++){
            current+=nums[i];
            nums[i]=current;
        }
        return nums;
    }
}