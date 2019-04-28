package leetcode;

public class Solution141 {

    class ListNode{
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * 如何判断链表中是否有环，这个方法太厉害了
     * 让一个指针一次移动两格，另一个指针一次移动一格，若快的指针能够等于慢的指针，说明有环
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {

        /**
         *
         */
        if (head == null) {
            return false;
        }
        ListNode walker = head;
        ListNode runner = head;
        while (runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner) {
                return true;
            }
        }
        return false;

        /**
         * 耗时较长
         */
//        Set<ListNode> set = new HashSet<>();
//        while (head != null) {
//            if (set.contains(head)) {
//                return true;
//            }
//            set.add(head);
//            head = head.next;
//        }
//        return false;

    }

}
