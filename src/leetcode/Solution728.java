package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution728 {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right ; i++) {
            if (isSelfDividing(i)) {
                list.add(i);
            }
        }
        return list;

    }

    public boolean isSelfDividing(int num) {

        int copy = num;

        while (num > 0) {
            int n = num % 10;
            num = num / 10;
            if (n == 0) {
                return false;
            } else {
                if (copy % n != 0) {
                    return false;
                }
            }
        }
        return true;

    }

}
