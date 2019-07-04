package offer;

public class Solution42 {

    public int FindGreatestSumOfSubArray(int[] array) {

        if (array == null || array.length == 0) {
            return 0;
        }
        int[] dp = new int[array.length + 1];
        dp[0] = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            dp[i + 1] = (dp[i] > 0 ? dp[i] : 0) + array[i];
            if (max < dp[i + 1]) {
                max = dp[i + 1];
            }
        }
        return max;

    }

}
