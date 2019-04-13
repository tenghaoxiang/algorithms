package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution347 {

    public List<Integer> topKFrequent(int[] nums, int k) {

        final int length = nums.length;
        List<Integer>[] bucket = new List[length + 1];
        Map<Integer, Integer> map = new HashMap<>();

        /**
         * map.getOrDefault()方法，要学会使用
         */
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        /**
         * bucket数组中记录了各种频率，从高到低遍历，若非空，则
         * 是当前的最高频率，加入res列表中，直到加入k个为止。
         */
        List<Integer> res = new ArrayList<>();
        for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
            if (bucket[pos] != null) {
                res.addAll(bucket[pos]);
            }
        }
        return res;
    }

}
