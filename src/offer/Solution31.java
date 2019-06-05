package offer;

import java.util.Stack;

public class Solution31 {

    public boolean IsPopOrder(int [] pushA,int [] popA) {

        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        while (i < pushA.length && j < popA.length) {
            while (i < pushA.length && (stack.isEmpty() || stack.peek() != popA[j])) {
                stack.push(pushA[i]);
                i++;
            }
            while (j < popA.length && !stack.isEmpty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.empty();

    }

}
