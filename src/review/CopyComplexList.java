package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/8 上午9:02
 * @Description
 */
public class CopyComplexList {

    class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead){

        if (pHead == null) {
            return null;
        }

        RandomListNode cur = pHead;
        while (pHead != null) {
            RandomListNode node = new RandomListNode(cur.label);
            node.next = cur.next;
            cur.next = node;
            cur = node.next;
        }

        cur = pHead;
        while (cur != null) {
            RandomListNode clone = cur.next;
            clone.random = cur.random == null ? null : cur.random.next;
            cur = cur.next.next;
        }

        cur = pHead;
        RandomListNode res = cur.next;
        while (cur != null) {
            RandomListNode clone = cur.next;
            cur.next = clone.next;
            clone.next = clone.next == null ? null : clone.next.next;
            cur = cur.next;
        }

        return res;

    }

}
