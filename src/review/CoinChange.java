package review;

/**
 * @author tenghaoxiang
 * @date 2019/9/7 下午4:58
 * @Description
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        if (amount <= 0) {
            return -1;
        }
        int[] dp = new int[amount + 1];
        int sum = 0;
        while (++sum <= amount) {
            int min = -1;
            for (int coin : coins) {
                if (sum >= coin && dp[sum - coin] != -1) {
                    int temp = dp[sum - coin] + 1;
                    if (min < 0 || temp < min) {
                        min = temp;
                    }
                }
            }
            dp[sum] = min;
        }
        return dp[amount];

    }

}
