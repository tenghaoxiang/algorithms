package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * S中的字符有多少个和J中的相同
 */
public class Solution771 {

//    public static int numJewelsInStones(String J, String S) {
//        int res=0;
//        for(char c : S.toCharArray()){
//            if(J.indexOf(c) != -1){
//                res++;
//            }
//        }
//        return res;
//    }

    public int numJewelsInStones(String J, String S) {

        final int length_J = J.length();
        final int length_S = S.length();
        int num = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length_J; i++) {
            map.put(J.charAt(i), 0);
        }
        for (int i = 0; i < length_S; i++) {
            Character key = S.charAt(i);
            if (map.containsKey(key)) {
                num++;
            }
        }
        return num;

    }

}
