
class Solution {

    public static int maxTurbulenceSize(int[] arr) {
        int end = 0;
        int ans = 1;
        for (int s = 0; s < arr.length - 1; s++) {
            if (arr[s] == arr[s + 1]) continue;

            for (end = s + 1; end < arr.length - 1; end++) {
                boolean res = isValleyOrMountain(arr, end);
                if (!res) break;
            }
            ans = Math.max(end - s + 1, ans);
        }
        return ans;
    }

    static boolean isValleyOrMountain(int[] arr, int i) {
        if (arr[i] < arr[i + 1] && arr[i - 1] > arr[i]) return true;
        else return arr[i] > arr[i + 1] && arr[i - 1] < arr[i];
    }

    public static void main(String[] args) {
        int[] a = {9,4,2,10,7,8,8,1,9};
        System.out.println("args = " + maxTurbulenceSize(a));
    }
}
