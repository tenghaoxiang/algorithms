package offer;


import java.util.Stack;

public class Solution24 {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {

        ListNode pre = null;
        ListNode next = null;

        if (head == null) {
            return null;
        }
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }

}
