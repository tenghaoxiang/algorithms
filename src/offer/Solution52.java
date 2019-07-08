package offer;

public class Solution52 {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        int length1 = 0;
        int length2 = 0;
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;
        while (cur1 != null) {
            length1++;
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            length2++;
            cur2 = cur2.next;
        }
        int max = Math.max(length1, length2);
        if (max == length1) {
            for (int i = 0; i < length1 - length2; i++) {
                pHead1 = pHead1.next;
            }
        } else {
            for (int i = 0; i < length2 - length1; i++) {
                pHead2 = pHead2.next;
            }
        }
        while (pHead1 != null) {
            if (pHead1 == pHead2) {
                return pHead1;
            } else {
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
        }
        return null;

    }

}
