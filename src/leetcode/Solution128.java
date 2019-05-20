package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution128 {

    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            set.add(num);
        }
        int maxLength = 0;
        for (Integer num : nums) {
            if (set.remove(num)) {
                int currentLength = 1;
                int current = num;
                while (set.remove(current - 1)) {
                    current--;
                }
                currentLength = currentLength + num - current;
                current = num;
                while (set.remove(current + 1)) {
                    current++;
                }
                currentLength = currentLength + current - num;
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;

    }

}
