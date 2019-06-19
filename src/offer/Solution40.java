package offer;

import java.util.ArrayList;

public class Solution40 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        if (k <= 0 || k > input.length) {
            return list;
        }
        if (k == input.length) {
            for (int i = 0; i < k; i++) {
                list.add(input[i]);
            }
            return list;
        }
        int index = partition(input, 0, input.length - 1);
        while (index != k) {
            if (index > k) {
                index = partition(input, 0, index - 1);
            } else {
                index = partition(input, index + 1, input.length - 1);
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;

    }

    public int partition(int[] nums, int start, int end) {
        int num = nums[start];
        int left = start;
        int right = end + 1;
        while (true) {
            while (nums[++left] < num) {
                if (left >= end) {
                    break;
                }
            }
            while (nums[--right] > num) {

            }
            if (left >= right) {
                break;
            }
            int m = nums[left];
            nums[left] = nums[right];
            nums[right] = m;
        }
        nums[start] = nums[right];
        nums[right] = num;
        return right;
    }

}
