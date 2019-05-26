package leetcode;

public class Solution82 {

    class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int x) {
            this.val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode pre = res;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            while (cur != null && cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            if (pre.next == cur) {
                pre = pre.next;
            } else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return res.next;

    }


}
