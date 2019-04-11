package offer;

import java.util.Stack;

public class Solution9 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    /**
     * 大佬的思路，不做多余的操作，只在需要时进行‘倒腾’
     * @return
     */
    public int pop() {

        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();

    }

    /**
     * 我的思路，每次stack2取出头部后都需要再放回stack1中
     * 浪费了很多时间，毕竟stack2中的数据已经是按照队列先进
     * 先出的顺序排好了，没必要再次放回stack1中，只需要当
     * stack2中为空时，将stack1中的元素放到stack2中即可
     */
//    public int pop() {
//
//        while (!stack1.empty()) {
//            stack2.push(stack1.pop());
//        }
//        int k = stack2.pop();
//        while (!stack2.empty()) {
//            stack1.push(stack2.pop());
//        }
//        return k;
//
//    }

}
