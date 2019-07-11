package offer;

import java.util.ArrayList;

public class Solution57 {

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (sum < 3) {
            return res;
        }
        int left = 1;
        int right = 2;
        int mid = (sum + 1) / 2;
        int cur = left + right;
        while (left < mid) {
            if (cur == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = left; i <= right; i++) {
                    list.add(i);
                }
                res.add(list);
            }
            while (cur > sum && left < mid) {
                cur = cur - left;
                left++;
                if (cur == sum) {
                    ArrayList<Integer> list = new ArrayList<>();
                    for (int i = left; i <= right; i++) {
                        list.add(i);
                    }
                    res.add(list);
                }
            }
            right++;
            cur = cur + right;
        }
        return res;

    }

}
