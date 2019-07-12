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

    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if (array.length < 2) {
            return res;
        }
        int cur;
        int left = 0;
        int right = array.length - 1;
        int multi = Integer.MAX_VALUE;
        while (right > left) {
            cur = array[left] + array[right];
            if (cur == sum) {
                if (array[left] * array[right] < multi) {
                    multi = array[left] * array[right];
                    if (res.isEmpty()) {

                    } else {
                        res.remove(1);
                        res.remove(0);
                    }
                    res.add(array[left]);
                    res.add(array[right]);
                }
                left++;
                right--;
            } else if (cur < sum) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }

}
