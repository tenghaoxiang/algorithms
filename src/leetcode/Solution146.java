package leetcode;

import java.util.HashMap;

public class Solution146 {
}

class LRUCache {

    private  static class DLinkedNode{
        int key;
        int value;
        DLinkedNode pre;
        DLinkedNode post;
    }

    /**
     * 总是在头结点插入新节点
     */
    public void addNode(DLinkedNode node) {
        node.pre = head;
        node.post = head.post;
        head.post.pre = node;
        head.post = node;
    }

    /**
     * 摘除一个节点
     */
    public void removeNode(DLinkedNode node) {
        node.pre.post = node.post;
        node.post.pre = node.pre;
    }

    /**
     * 摘除一个节点，并且将它移动到开头
     */
    private void moveToHead(DLinkedNode node) {
        this.removeNode(node);
        this.addNode(node);
    }

    private DLinkedNode popTail() {
        DLinkedNode res = tail.pre;
        this.removeNode(res);
        return res;
    }

    private HashMap<Integer, DLinkedNode> cache = new HashMap<>();
    private int count;
    private int capacity;
    private DLinkedNode head, tail;

    public LRUCache(int capacity) {
        this.count = 0;
        this.capacity = capacity;

        head = new DLinkedNode();
        head.pre = null;

        tail = new DLinkedNode();
        tail.post = null;

        head.post = tail;
        tail.pre = head;
    }

    public int get(int key) {

        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        this.moveToHead(node);
        return node.value;

    }

    public void put(int key, int value) {

        DLinkedNode node = cache.get(key);

        if (node == null) {
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;

            this.cache.put(key, newNode);
            this.addNode(newNode);

            ++count;

            if (count > capacity) {
                DLinkedNode tail = this.popTail();
                this.cache.remove(tail.key);
                count--;
            }
        } else {
            node.value = value;
            this.moveToHead(node);
        }

    }
}