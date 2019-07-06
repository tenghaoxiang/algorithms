package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution45 {

    public String PrintMinNumber(int [] numbers) {

        final int length = numbers.length;
        String res = "";
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });
        for (int num : list) {
            res += num;
        }
        return res;

    }

}
