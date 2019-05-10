package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution209 {

    /**
     * 起初想到了双指针，但没有深想，没想到O(n)可以用双指针实现，多多思考
     * @param s
     * @param nums
     * @return
     */
    public int minSubArrayLen(int s, int[] nums) {

        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
        while (j < nums.length) {
            sum = sum + nums[j++];

            while (sum >= s) {
                min = Math.min(min, j - i);
                sum = sum - nums[i++];
            }

        }
        return min == Integer.MAX_VALUE ? 0 : min;

    }

    /**
     * 太菜了太菜了，想不出更好的办法了，这个方法太耗时了
     */
//    public int minSubArrayLen(int s, int[] nums) {
//
//        int sum;
//        Deque<Integer> deque = new LinkedList<>();
//
//        for (int i = 1; i <= nums.length; i++) {
//            sum = 0;
//            deque.clear();
//            for (int j = 0; j < nums.length; j++) {
//                if (deque.size() >= i) {
//                    sum = sum - deque.removeFirst();
//                }
//                deque.addLast(nums[j]);
//                sum = sum + nums[j];
//                if (sum >= s) {
//                    return i;
//                }
//            }
//        }
//        return 0;
//
//    }

}
