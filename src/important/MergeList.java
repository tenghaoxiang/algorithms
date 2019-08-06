package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/6 下午8:04
 * @Description 合并两个有序链表
 */
public class MergeList {

    class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode merge(ListNode l1, ListNode l2) {

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
                    head = l1;
                    cur = l1;
                } else {
                    cur.next = l1;
                    cur = cur.next;
                }
                l1 = l1.next;
            } else {
                if (head == null) {
                    head = l2;
                    cur = l2;
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
