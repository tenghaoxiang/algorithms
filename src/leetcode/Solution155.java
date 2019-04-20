package leetcode;

public class Solution155 {
}

/**
 * 实现一个栈，但要求能够在常数时间内找出栈内的最小值，
 * 大佬很经典的思路:用min保存最小值，若新压入的值小于
 * 当前所保存的min值，则一次性把min和当前这个数都压进去，
 * 这样，当删除到到最小值时，它下边就是次小值，找到次小值后，
 * 只需要把它删除即可
 */

/**
 * 也可以利用java自带的Stack来实现
 * class MinStack {
 *     int min = Integer.MAX_VALUE;
 *     Stack<Integer> stack = new Stack<Integer>();
 *     public void push(int x) {
 *         if(x <= min){
 *             stack.push(min);
 *             min=x;
 *         }
 *         stack.push(x);
 *     }
 *
 *     public void pop() {
 *         if(stack.pop() == min) min=stack.pop();
 *     }
 *
 *     public int top() {
 *         return stack.peek();
 *     }
 *
 *     public int getMin() {
 *         return min;
 *     }
 * }
 */
class MinStack {

    Node top;
    int min;

    class Node {
        int val;
        Node next;

        public Node(int x) {
            this.val = x;
        }
    }

    public MinStack() {
        top = null;
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x <= min) {
            Node node1 = new Node(min);
            node1.next = top;
            top = node1;
            min = x;
        }
        Node node = new Node(x);
        node.next = top;
        top = node;
    }

    public void pop() {
        if (top.val == min) {
            top = top.next;
            min = top.val;
        }
        top = top.next;
    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        return min;
    }

}
