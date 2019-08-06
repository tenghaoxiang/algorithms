package review;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tenghaoxiang
 * @date 2019/8/6 上午9:28
 * @Description
 */
public class LRUCache {

    private class Node{
        int key;
        int value;
        Node pre;
        Node next;
    }

    private int capacity;
    private int count;
    private Map<Integer, Node> cache = new HashMap<>();
    private Node head;
    private Node tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        count = 0;
        head = new Node();
        head.pre = null;
        tail = new Node();
        tail.next = null;
        head.next = tail;
        tail.pre = head;
    }

    public void addNode(Node node) {
        node.next = head.next;
        node.pre = head;
        head.next.pre = node;
        head.next = node;
    }

    public void removeNode(Node node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public void moveToHead(Node node){
        this.removeNode(node);
        this.addNode(node);
    }

    public Node popTail() {
        Node node = tail.pre;
        this.removeNode(node);
        return node;
    }

    public int get(int key){

        Node node = cache.get(key);
        if(node == null){
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
            if(count > capacity){
                Node tail = this.popTail();
                this.cache.remove(tail.key);
                count--;
                tail = null;
            }
        }else {
            node.value = value;
            this.moveToHead(node);
        }

    }

}
