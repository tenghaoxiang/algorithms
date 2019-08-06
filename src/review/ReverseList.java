package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/6 上午10:06
 * @Description
 */
public class ReverseList {

    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public Node reverse(Node head){

        if(head == null || head.next == null){
            return head;
        }
        Node pre = null;
        Node cur = head;
        Node next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;

    }

}
