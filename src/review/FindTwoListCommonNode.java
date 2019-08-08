package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/8 上午8:53
 * @Description
 */
public class FindTwoListCommonNode {

    class ListNode{
        int val;
        ListNode next = null;

        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        int length1 = length(pHead1);
        int length2 = length(pHead2);
        if (length1 > length2) {
            int length = length1 - length2;
            for (int i = 0; i < length; i++) {
                pHead1 = pHead1.next;
            }
        } else {
            int length = length2 - length1;
            for (int i = 0; i < length; i++) {
                pHead2 = pHead2.next;
            }
        }
        while (pHead1 != null && pHead2 != null && pHead1 != pHead2) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;

    }

    public int length(ListNode head) {

        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;

    }

}
