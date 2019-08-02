package important;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tenghaoxiang
 * @date 2019/8/2 下午6:46
 * @Description 用HashMap和双向链表实现LRU，get(key)和put(key, value)都要求O(1)时间复杂度
 */
public class LRUCache {

    class Node{
        int key;
        int value;
        Node prev;
        Node next;
    }

    private Map<Integer, Node> cache = new HashMap<>();
    private int capacity; //容量
    private int count; //当前节点数量
    private Node head; //头节点
    private Node tail; //尾节点

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.count = 0;

        head = new Node();
        head.prev = null;

        tail = new Node();
        tail.next = null;

        head.next = tail;
        tail.prev = head;
    }

    /**
     * 在头部插入节点
     * @param node
     */
    public void addNode(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    /**
     * 移除一个节点
     * @param node
     */
    public void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    /**
     * 移除一个节点，并添加到头部
     */
    private void moveToHead(Node node) {
        this.removeNode(node);
        this.addNode(node);
    }

    /**
     * 删除最后有一个节点
     * @return
     */
    private Node popTail() {
        Node node = tail.prev;
        this.removeNode(node);
        return node;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        this.moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {

        Node node = cache.get(key);
        if (node == null) {
            node = new Node();
            node.key = key;
            node.value = value;
            this.cache.put(key, node);
            this.addNode(node);
            count++;
            if (count > capacity) {
                Node tail = this.popTail();
                this.cache.remove(tail.key);
                count--;
                tail = null;
            }
        } else {
            node.value = value;
            this.moveToHead(node);
        }

    }

}
