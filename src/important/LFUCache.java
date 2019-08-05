package important;

import java.util.HashMap;
import java.util.LinkedHashSet;

/**
 * @author tenghaoxiang
 * @date 2019/8/5 下午9:09
 * @Description 实现LFU，要求时间复杂度O(1)
 */
public class LFUCache {

    HashMap<Integer, Integer> cache;
    HashMap<Integer, Integer> counts;
    HashMap<Integer, LinkedHashSet<Integer>> lists;

    int capacity;
    int min = -1;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        counts = new HashMap<>();
        lists = new HashMap<>();
        lists.put(1, new LinkedHashSet<>());
    }

    public int get(int key) {

        if (!cache.containsKey(key)) {
            return -1;
        }
        int count = counts.get(key);
        counts.put(key, count + 1);
        lists.get(count).remove(key);
        if (count == min && lists.get(count).size() == 0) {
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
            get(key);
            return;
        }
        if (cache.size() >= capacity) {
            int outKey = lists.get(min).iterator().next();
            lists.get(min).remove(outKey);
            cache.remove(outKey);
            counts.remove(outKey);
        }
        cache.put(key, value);
        counts.put(key, 1);
        min = 1;
        lists.get(1).add(key);

    }

}
