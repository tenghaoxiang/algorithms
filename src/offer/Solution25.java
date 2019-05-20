package offer;

public class Solution25 {

    class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int x) {
            this.val = x;
        }
    }

    public ListNode Merge(ListNode list1,ListNode list2) {

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode head = null;

        if (list1.val < list2.val) {
            head = list1;
            head.next = Merge(list1.next, list2);
        } else {
            head = list2;
            head.next = Merge(list1, list2.next);
        }

        return head;

    }

}
