class Solution {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = row * col - 1;

        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            int midpoint_element = matrix[midpoint / col][midpoint % col];
            if (midpoint_element == target) return true;
            else if (midpoint_element > target)
                right = midpoint - 1;
            else left = midpoint + 1;
        }

        return false;

    }


    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 13, 13, 22, 28}, {31, 33, 34, 34, 36, 38}, {40, 48, 49, 51, 52, 53}, {55, 56, 59, 60, 60, 60},
                {61, 63, 63, 64, 67, 70,}
        };
        System.out.println("args = " + searchMatrix(arr, 63));
    }
}