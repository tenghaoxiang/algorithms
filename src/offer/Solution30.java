package offer;

import java.util.Stack;

public class Solution30 {

    int min;

    Stack<Integer> stack = new Stack<>();

    public void push(int node) {
        if (stack.size() == 0) {
            min = node;
        }
        if (node <= min) {
            stack.push(min);
            min = node;
        }
        stack.push(node);
    }

    public void pop() {

        int num = stack.pop();
        if (num == min) {
            min = stack.pop();
        }

    }

    public int top() {

        return stack.peek();

    }

    public int min() {
        return min;
    }

}
