package offer;

public class RectangeCover {

    public int RectCover(int target) {

        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        int[] dp = new int[target + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= target; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[target];

    }

}
