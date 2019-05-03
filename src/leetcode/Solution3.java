package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution3 {

    /**
     * 耶！时隔多天，终于自己写出一个ac的代码，开心！
     * 采用双端队列
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {

        final int length = s.length();
        int max = 0;
        int n = 0;
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            if (deque.contains(s.charAt(i))) {
                while (deque.peekFirst() != s.charAt(i)) {
                    deque.pollFirst();
                }
                deque.pollFirst();
                deque.addLast(s.charAt(i));
                n = deque.size();
            } else {
                deque.addLast(s.charAt(i));
                n++;
                if (n > max) {
                    max = n;
                }
            }
        }
        return max;

    }

}
