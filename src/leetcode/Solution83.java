package leetcode;

public class Solution83 {

    class ListNode{
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode cur = head;
        while (cur != null && cur.next != null) {
            while (cur.val == cur.next.val) {
                cur.next = cur.next.next;
                if (cur.next == null) {
                    break;
                }
            }
            cur = cur.next;
        }
        return head;

    }

}
