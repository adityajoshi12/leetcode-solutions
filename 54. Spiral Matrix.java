
class Solution {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        int min_r = 0;
        int min_c = 0;
        int max_r = matrix.length - 1;
        int max_c = matrix[0].length - 1;
        int tle = matrix.length * matrix[0].length;
        int ctr = 0;
        while (ctr < tle) {


            // top wall
            for (int i = min_r, j = min_c; j <= max_c && ctr < tle; j++) {
                list.add(matrix[i][j]);
                ctr++;
            }

            min_r++;

            //right wall
            for (int i = min_r, j = max_c; i <= max_r && ctr < tle; i++) {
                list.add(matrix[i][j]);
                ctr++;
            }
            max_c--;

            // bottom wall
            for (int i = max_r, j = max_c; j >= min_c && ctr < tle; j--) {
                list.add(matrix[i][j]);
                ctr++;
            }
            max_r--;

            // left wall
            for (int i = max_r, j = min_c; i >= min_r && ctr < tle; i--) {
                list.add(matrix[i][j]);
                ctr++;
            }
            min_c++;
        }
        return list;

    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        System.out.println("args = " + spiralOrder(arr));
    }
}


