package twice;

public class Solution2 {

    class ListNode{
        int val;
        ListNode next = null;
        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = 0;
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while (l1 != null || l2 != null) {
            sum = sum / 10;
            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }
        if (sum / 10 == 1) {
            cur.next = new ListNode(1);
        }
        return res.next;

    }

}
