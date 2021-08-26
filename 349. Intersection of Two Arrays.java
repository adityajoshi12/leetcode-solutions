class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i, j;
        i = j = 0;
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {
                if (!list.contains(nums1[i]))
                    list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j])
                i++;
            else j++;

        }
        return list.stream().mapToInt(r -> r).toArray();
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{4, 9, 5};
        int[] num2 = new int[]{9, 4, 9, 8, 4};
        System.out.println("args = " + Arrays.toString(intersection(num1, num2)));
    }

}


