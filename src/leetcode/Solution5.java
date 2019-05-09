package leetcode;

public class Solution5 {

    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0) {
            return s;
        }
        final int length = s.length();
        String res = null;
        boolean[][] dp = new boolean[length][length];

        for (int i = length - 1; i >= 0; i--) {
            for (int j = i; j < length; j++) {
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i < 3 || dp[i + 1][j - 1]);
                if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
                    res = s.substring(i, j + 1);
                }
            }
        }

        return res;

    }

}
