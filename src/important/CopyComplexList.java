package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/7 下午8:00
 * @Description 复制复杂链表，分三步，在根据next在节点后复制，再复制random，拆分链表
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

        //在当前节点后复制当前节点
        while (cur != null) {
            RandomListNode node = new RandomListNode(cur.label);
            node.next = cur.next;
            cur.next = node;
            cur = cur.next.next;
        }

        //修复random
        cur = pHead;
        while (cur != null) {
            //注意null的判断
            cur.next.random = cur.random == null ? null : cur.random.next;
            cur = cur.next.next;
        }

        //根据奇偶位置拆分链表
        cur = pHead;
        RandomListNode res = cur.next;
        while (cur != null) {
            RandomListNode cloneNode = cur.next;
            cur.next = cloneNode.next;
            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
            cur = cur.next;
        }

        return res;

    }

}
