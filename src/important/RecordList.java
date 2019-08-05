package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/5 下午10:24
 * @Description 重组链表 L0→L1→…→Ln-1→Ln 变为 L0→Ln→L1→Ln-1→L2→Ln-2→… , 相对位置不能变
 */
public class RecordList {

    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        //找到链表的中间节点
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //反转中间节点后的链表  1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode preMid = slow;
        ListNode preCur = slow.next;
        ListNode cur = slow.next;
        //一个类似于头插法的过程
        while (preCur.next != null) {
            cur = preCur.next;
            preCur.next = cur.next;
            cur.next = preMid.next;
            preMid.next = cur;
        }

        //开始重组
        ListNode head1 = head;
        ListNode head2 = preMid.next;
        while (head1 != preMid) {
            preMid.next = head2.next;
            head2.next = head1.next;
            head1.next = head2;
            head1 = head2.next;
            head2 = preMid.next;
        }

    }

}
