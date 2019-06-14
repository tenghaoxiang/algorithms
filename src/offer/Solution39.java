package offer;

import java.util.HashMap;
import java.util.Map;

public class Solution39 {

    public int MoreThanHalfNum_Solution(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], count = map.getOrDefault(array[i], 0) + 1);
            if (count > array.length / 2) {
                return array[i];
            }
        }
        return 0;

    }

}
