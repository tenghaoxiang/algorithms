package offer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution50 {

    public int FirstNotRepeatingChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        int pos = -1;
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                pos = i;
                break;
            }
        }
        return pos;
    }

}
