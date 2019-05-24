package leetcode;

import java.util.Stack;

public class Solution25 {

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            this.val = x;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        ListNode res = new ListNode(0);
        ListNode ans = res;
        int size = 0;
        while (cur != null) {
            stack.push(cur);
            size++;
            cur = cur.next;
            if (size == k) {
                for (int i = 0; i < k; i++) {
                    res.next = stack.pop();
                    res = res.next;
                }
                size = 0;
            }
        /**
         * 一定注意这一行，否则可能引起相互引用，造成死循环
         */
            res.next = null;
        }
        while (!stack.isEmpty()) {
            res.next = stack.get(0);
            res = res.next;
            stack.remove(0);
        }
        return ans.next;

    }

}
