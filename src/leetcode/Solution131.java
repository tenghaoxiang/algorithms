package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 这道题十分经典，在字符串中利用深度优先搜索和回溯，
 * 找出字符串及其子字符串中的所有回文。
 */
public class Solution131 {

    List<List<String>> result = new ArrayList<>();
    List<String> remain = new ArrayList<>();

    public List<List<String>> partition(String s) {

        if (s == null || s.length() == 0) {
            return result;
        }
        dfs(s, 0);
        return result;

    }

    public void dfs(String s, int left) {

        if (left >= s.length()) {
            result.add(new ArrayList<>(remain));
            return;
        }

        for (int right = left; right < s.length(); right++) {
            if (isPalindrome(s, left, right)) {
                remain.add(s.substring(left, right + 1));
                dfs(s, right + 1);
                remain.remove(remain.size() - 1);
            }
        }

    }

    public boolean isPalindrome(String s, int left, int right) {
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

}
