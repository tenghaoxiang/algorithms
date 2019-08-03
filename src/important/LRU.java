package important;

import java.util.Map;

/**
 * @author tenghaoxiang
 * @date 2019/8/3 下午10:18
 * @Description
 */
public class LRU {

    class Node{
        int key;
        int value;
        Node pre;
        Node next;
    }

    Node head;
    Node tail;
    Map<Integer, Node> map;
    int capacity;
    int count;

    public LRU(int capacity) {
        this.capacity = capacity;
        this.count = 0;

        head = new Node();
        tail = new Node();

        head.pre = null;
        head.next = tail;
        tail.pre = head;
        tail.next = null;
    }

    /**
     * 在头部添加节点
     */
    public void addHead(Node node) {
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    /**
     * 移除一个节点
     */
    public void removeNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    /**
     * 移动一个节点到头部
     */
    public void moveToHead(Node node) {
        this.removeNode(node);
        this.addHead(node);
    }

    /**
     * 删除尾部的节点
     */
    public Node popTail() {
        Node node = tail.pre;
        this.removeNode(node);
        return node;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        this.moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null) {
            node = new Node();
            node.key = key;
            node.value = value;
            this.map.put(key, node);
            this.addHead(node);
            count++;
            if (count > capacity) {
                Node tail = this.popTail();
                this.map.remove(tail);
                count--;
                tail = null;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

}
