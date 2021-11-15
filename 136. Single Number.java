class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map =new HashMap();
        
        for(int num: nums)
            map.put(num,map.getOrDefault(num,0)+1);
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if( entry.getValue()==1) return entry.getKey();
        }
        return -1;
   }
}

// alternate solution
/* class Solution {
    public int singleNumber(int[] nums) {
       int result=0;
        
        for(int a : nums){
            result ^=a;
        }
        return result;
     }
} */
