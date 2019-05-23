package leetcode;

public class Solution86 {

    class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int x) {
            this.val = x;
        }
    }

    public ListNode partition(ListNode head, int x) {

        ListNode smallerHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);
        ListNode smallerLast = smallerHead;
        ListNode greaterLast = greaterHead;
        while (head != null) {
            if (head.val < x) {
                smallerLast.next = head;
                smallerLast = smallerLast.next;
            } else {
                greaterLast.next = head;
                greaterLast = greaterLast.next;
            }
            head = head.next;
        }
        greaterLast.next = null;
        smallerLast.next = greaterHead.next;
        return smallerHead.next;

    }

}
