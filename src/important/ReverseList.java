package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/5 下午6:32
 * @Description 反转链表
 */
public class ReverseList {

    public class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node reverse(Node head) {

        Node pre = null;
        Node next = null;
        Node cur = head;

        if (head == null) {
            return null;
        }

        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;

    }

}
