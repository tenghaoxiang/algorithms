package leetcode;

public class Solution821 {

    /**
     * Given a string S and a character C, return an array of integers
     * representing the shortest distance from the character C in the string.
     * 思路很棒，前序遍历一次，后序遍历一次
     * @param S
     * @param C
     * @return
     */
    public int[] shortestToChar(String S, char C) {

        final int length = S.length();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = S.charAt(i) == C ? 0 : length;
        }
        for (int i = 1; i < length; i++) {
            nums[i] = Math.min(nums[i], nums[i - 1] + 1);
        }
        for (int i = length - 2; i >= 0; i--) {
            nums[i] = Math.min(nums[i], nums[i + 1] + 1);
        }
        return nums;

    }

}
