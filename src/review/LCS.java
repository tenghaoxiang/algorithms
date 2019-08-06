package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/6 上午9:55
 * @Description
 */
public class LCS {

    public int length(String s1, String s2){

        if(s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0){
            return 0;
        }
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(n - 1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];

    }

}
