package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution239 {

    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null || nums.length < k || k <= 0) {
            return new int[0];
        }

        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.getLast()] < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(i);
            if (deque.getFirst() == i - k) {
                deque.removeFirst();
            }
            if (i >= k - 1) {
                res[i - k + 1] = nums[deque.getFirst()];
            }
        }
        return res;

    }

}
