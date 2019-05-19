package leetcode;

public class Solution11 {

    public int maxArea(int[] height) {

        if (height == null) {
            return 0;
        }
        int res = Integer.MIN_VALUE;
        for (int i = 0, j = height.length - 1; i < j; ) {
            res = Math.max(res, (j - i) * Math.min(height[i], height[j]));
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return res;

    }

}
