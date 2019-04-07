package leetcode;

import java.util.List;

public class Solution139 {

    public boolean wordBreak(String s, List<String> wordDict) {

        String[] array = wordDict.toArray(new String[0]);
        int head = 0;
        while (head < s.length()) {
            int k = head;
            for (int i = 0; i < array.length; i++) {
                int length = array[i].length();
                if (head + length <= s.length()) {
                    if (s.substring(head, head + length).equals(array[i])) {
                        head = head + length;
                    }
                }
            }
            if (k == head) {
                return false;
            }
        }
        return true;

    }

}
