class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
                
        ArrayList<Integer> arr = new ArrayList<>();

        if (len1 == 0 || len2 == 0) return (new int[0]);
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int count = 0;
        
        for (int i = 0; i < len1; i++){
            while(count < nums2.length){
                if (nums1[i] == nums2[count]){
                    arr.add(nums2[count]);
                    count++;
                    break;
                }
                else if (nums1[i] < nums2[count]){
                    break;
                }
                else {
                    count++;
                }
            }
        }
        
        int[] result = new int[arr.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = arr.get(i);
        }
                return result;

    }
}