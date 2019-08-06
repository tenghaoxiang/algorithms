package review;

import java.util.HashMap;
import java.util.LinkedHashSet;

/**
 * @author tenghaoxiang
 * @date 2019/8/6 上午10:47
 * @Description
 */
public class LFUCache {

    private HashMap<Integer, Integer> cache;
    private HashMap<Integer, Integer> counts;
    private HashMap<Integer, LinkedHashSet<Integer>> lists;

    private int capacity;
    private int min;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        min = -1;
        cache = new HashMap<>();
        counts = new HashMap<>();
        lists = new HashMap<>();
    }

    public int get(int key) {

        if (!cache.containsKey(key)) {
            return -1;
        }
        int count = counts.get(key);
        counts.put(key, count + 1);
        lists.get(count).remove(key); //使用LinkedHashSet可以在O(1)时间复杂度内找到并删除节点，如果使用LinkedList则需要O(n)
        if (count == min && lists.get(count).isEmpty()) {
            min++;
        }
        if (!lists.containsKey(count + 1)) {
            lists.put(count + 1, new LinkedHashSet<>());
        }
        lists.get(count + 1).add(key);
        return cache.get(key);

    }

    public void put(int key, int value) {

        if (capacity <= 0) {
            return;
        }

        if (cache.containsKey(key)) {
            cache.put(key, value);
            this.get(key);
            return;
        }

        if (cache.size() >= capacity) {
            int removeKey = lists.get(min).iterator().next();
            lists.get(min).remove(removeKey);
            cache.remove(removeKey);
            counts.remove(removeKey);
        }

        min = 1;
        cache.put(key, value);
        counts.put(key, 1);
        lists.get(1).add(key);

    }

}
