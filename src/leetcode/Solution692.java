package leetcode;

import java.util.*;

public class Solution692 {

    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        List<String>[] bucket = new List[words.length + 1];
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        for (int i = bucket.length - 1; i >= 0 && list.size() < k; i--) {
            if (bucket[i] != null) {
                Collections.sort(bucket[i]);
                list.addAll(bucket[i]);
            }
        }
        return list.subList(0, k);

    }

}
