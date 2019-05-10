package leetcode;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Solution219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;

        /**
         * 思路应该没问题，但是超时了...
         */
//        Deque<Integer> deque = new LinkedList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (deque.contains(nums[i])) {
//                return true;
//            }
//            deque.addLast(nums[i]);
//            if (deque.size() > k) {
//                deque.removeFirst();
//            }
//        }
//        return false;

    }

}
