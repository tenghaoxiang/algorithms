package offer;

public class Solution22 {

    class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }


    public ListNode FindKthToTail(ListNode head,int k) {

        /**
         * 定义两个指针，第一个指针从链表的头指针开始遍历向前走k-1步，
         * 第二个指针保持不变；从第k步开始，第二个指针也开始从链表的
         * 头部开始遍历。由于两个指针的距离保持在k-1，所以当第一个指针
         * 走到链表结尾时，第二个指针的位置恰好就是倒数第k个结点。
         */
        if (head == null || k <= 0) {
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        for (int i = 1; i < k; i++) {
            if (first.next != null) {
                first = first.next;
            } else {
                return null;
            }
        }
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        return second;

        /**
         * 遍历两遍链表
         */
//        if (head == null) {
//            return null;
//        }
//        ListNode cur = head;
//        int n = 0;
//        while (cur != null) {
//            cur = cur.next;
//            n++;
//        }
//        if (k > n) {
//            return null;
//        }
//        k = n - k + 1;
//        for (int i = 0; i < k - 1; i++) {
//            head = head.next;
//        }
//        return head;

    }

}
