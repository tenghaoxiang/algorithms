package leetcode;

public class Solution122 {

    public int maxProfit(int[] prices) {

        if (prices.length <= 1) {
            return 0;
        }
        int buy = prices[0];
        int sell = 0;
        for (int i = 1; i < prices.length; i++) {
            sell = Math.max(sell, prices[i] - buy);
            buy = Math.min(buy, prices[i] - sell);
        }
        return sell;

//        int res = 0;
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] - prices[i - 1] > 0) {
//                res += prices[i] - prices[i - 1];
//            }
//        }
//        return res;

    }

}
