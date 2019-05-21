package leetcode;

public class Solution21 {

    class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        /**
         * 递归
         */
//        if (l1 == null) {
//            return l2;
//        }
//        if (l2 == null) {
//            return l1;
//        }
//        ListNode head = null;
//        if (l1.val < l2.val) {
//            head = l1;
//            head.next = mergeTwoLists(l1.next, l2);
//        } else {
//            head = l2;
//            head.next = mergeTwoLists(l1, l2.next);
//        }
//        return head;

        /**
         * 非递归
         */
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = null;
        ListNode cur = null;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                if (head == null) {
                    cur = head = l1;
                } else {
                    cur.next = l1;
                    cur = cur.next;
                }
                l1 = l1.next;
            } else {
                if (head == null) {
                    cur = head = l2;
                } else {
                    cur.next = l2;
                    cur = cur.next;
                }
                l2 = l2.next;
            }
        }
        if (l1 == null && cur != null) {
            cur.next = l2;
        }
        if (l2 == null && cur != null) {
            cur.next = l1;
        }
        return head;

    }

}
