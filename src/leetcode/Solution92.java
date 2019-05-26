package leetcode;

public class Solution92 {

    class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {

        if (head == null) {
            return null;
        }
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode pre = res;
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode then = cur.next;
        for (int i = 0; i < n - m; i++) {
            cur.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = cur.next;
        }
        return res.next;

    }

}
