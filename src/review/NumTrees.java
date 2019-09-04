package review;

/**
 * @author tenghaoxiang
 * @date 2019/9/4 下午2:41
 * @Description
 */
public class NumTrees {

    public int numTrees(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];

    }

}
