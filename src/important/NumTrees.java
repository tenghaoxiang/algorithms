package important;

/**
 * @author tenghaoxiang
 * @date 2019/9/3 下午9:51
 * @Description 给定一个整数n，能生成多少个不同的BST, leetcode96题，参考解析
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
