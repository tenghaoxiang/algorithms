package review;

import java.util.ArrayList;

/**
 * @author tenghaoxiang
 * @date 2019/8/26 下午4:39
 * @Description
 */
public class PrintList {

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
