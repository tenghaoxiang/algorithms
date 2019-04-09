package offer;

import java.util.ArrayList;

public class Solution6 {

    class ListNode{
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        if (listNode == null) {
            return list;
        }
        printListFromTailToHead(listNode.next);
        list.add(listNode.val);
        return list;

    }

}
