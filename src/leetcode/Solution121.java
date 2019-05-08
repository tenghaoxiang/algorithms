package leetcode;

public class Solution121 {

    public static int maxProfit(int[] prices) {

        /**
         * 运用动态规划的思路进行求解
         */
        if (prices.length <= 1) {
            return 0;
        }
        int buy = prices[0];
        int sell = 0;
        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            sell = Math.max(sell, prices[i] - buy);
        }
        return sell;

//        int maxCur=0;
//        int maxSoFar = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//            maxCur = Math.max(0, maxCur + prices[i] - prices[i - 1]);
//            maxSoFar = Math.max(maxCur, maxSoFar);
//        }
//
//        return maxSoFar;

    }

}
