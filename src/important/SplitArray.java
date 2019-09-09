package important;

/**
 * @author tenghaoxiang
 * @date 2019/9/6 下午9:50
 * @Description 将一个数组分割成m份连续的子数组，子数组内元素加起来最小
 */
public class SplitArray {

    public int splitArray(int[] nums, int m) {

        int length = nums.length;
        int[] sum = new int[length + 1];
        sum[0] = 0;
        for (int i = 0; i < length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        int[] dp = new int[length];
        for (int i = 0; i < length; i++) {
            dp[i] = sum[length] - sum[i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < length - i; j++) {
                dp[i] = Integer.MAX_VALUE;
                for (int k = j + 1; k <= length - i; k++) {
                    int t = Math.max(dp[j], sum[j] - sum[i]);
                    if (t <= dp[i]) {
                        dp[i] = t;
                    } else {
                        break;
                    }
                }
            }
        }
        return dp[0];

    }

}
