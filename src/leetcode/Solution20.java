package leetcode;

import java.util.Stack;

public class Solution20 {

        public boolean isValid(String s) {

            Stack<Character> stack = new Stack<>();
            final int length = s.length();
            if (s == null || length == 0) {
                return true;
            }
            for (int i = 0; i < length; i++) {
                if (s.charAt(i) == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                } else {
                    stack.push(s.charAt(i));
                }
            }
            return stack.isEmpty();

        }

}
