package offer;

public class Solution23 {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {

        int num = hasLoop(pHead);
        if (num == 0) {
            return null;
        }
        ListNode slow = pHead;
        ListNode fast = pHead;
        for (int i = 0; i < num; i++) {
            fast = fast.next;
        }
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }

    public int hasLoop(ListNode pHead) {

        ListNode slow = pHead;
        ListNode fast = pHead;
        int count = 0;
        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast ) {
                do {
                    slow = slow.next;
                    count++;
                } while (slow != fast);
                break;
            }
        }
        return count;

    }

}
