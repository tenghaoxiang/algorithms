package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/7 上午8:55
 * @Description
 */
public class MergeList {

    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public Node merge(Node l1, Node l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        Node head = null;
        Node cur = null;
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
        if (l1 == null) {
            cur.next = l2;
        }
        if (l2 == null) {
            cur.next = l1;
        }
        return head;

    }

}
