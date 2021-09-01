class Solution {
    public int arrayNesting(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            int j=i;
            int count=0;
            while(!hs.contains(j)){
                hs.add(j);
                j=nums[j];
                count++;
                max=Math.max(count,max);
            }
        }
        return max;
    }
}