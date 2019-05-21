package leetcode;

public class Solution19 {

    class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        ListNode start = new ListNode(0);
        start.next = head;
        ListNode left = start;
        ListNode right = start;
        for (int i = 1; i <= n + 1; i++) {
            if (right != null) {
                right = right.next;
            } else {
                return null;
            }
        }
        while (right != null) {
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return start.next;

    }

}
