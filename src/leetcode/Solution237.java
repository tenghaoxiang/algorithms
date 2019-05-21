package leetcode;

public class Solution237 {

    class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

    }

}
