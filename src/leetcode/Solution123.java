package leetcode;

public class Solution123 {

    public int maxProfit(int[] prices) {

        if (prices.length <= 1) {
            return 0;
        }
        int firstBuy = prices[0];
        int firstSell = 0;
        int secondBuy = Integer.MAX_VALUE;
        int secondSell = 0;
        for (int i = 1; i < prices.length; i++) {
            firstBuy = Math.min(firstBuy, prices[i]);
            firstSell = Math.max(firstSell, prices[i] - firstBuy);
            secondBuy = Math.min(secondBuy,prices[i]-firstSell);
            secondSell = Math.max(secondSell, prices[i] - secondBuy);
        }
        return secondSell;

    }

}
