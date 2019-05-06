package twice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap {

    int capacity;

    public LRUCache(int cap) {
        capacity = cap;
    }

    public int get(int key) {
        return (int) super.get(key);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return super.size() > capacity;
    }
}
