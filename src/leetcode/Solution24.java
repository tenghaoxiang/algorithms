package leetcode;

public class Solution24 {

    class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start;
        ListNode cur = head;
        ListNode next = head.next;
        while (next != null) {
            pre.next = next;
            cur.next = next.next;
            next.next = cur;

            pre = cur;
            if (cur.next != null) {
                cur = cur.next;
                next = cur.next;
            } else {
                next = null;
            }
        }
        return start.next;

    }

}
