class Solution {
    public int countSubstrings(String s) {
                  int len = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int g = 0; g < s.length(); g++) {

            for (int i = 0, j = g; j < s.length(); i++, j++) {
                if (g == 0) {

                    dp[i][j] = true;
                } else if (g == 1) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                }
                if (dp[i][j]) len++;
            }
        }
        return len;
    }
}