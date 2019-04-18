package leetcode;

public class Solution53 {

    public int maxSubArray(int[] nums) {

        final int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < length; i++) {
            dp[i] = (dp[i - 1] > 0) ? dp[i - 1] + nums[i] : 0 + nums[i];
            max = Math.max(max, dp[i]);
        }
        return max;

    }

}
