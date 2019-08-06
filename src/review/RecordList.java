package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/6 上午11:09
 * @Description
 */
public class RecordList {

    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public void reorderList(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node preBegin = slow;
        Node cur = slow.next;
        Node preCur = slow.next;

        while (preCur.next != null) {
            cur = preCur.next;
            preCur.next = cur.next;
            cur.next = preBegin.next;
            preBegin.next = cur;
        }

        Node head1 = head;
        Node head2 = preBegin.next;
        while (head1 != preBegin) {
            preBegin.next = head2.next;
            head2.next = head1.next;
            head1.next = head2;
            head1 = head2.next;
            head2 = preBegin.next;
        }

    }

}
