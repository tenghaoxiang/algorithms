package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution448 {

    /**
     * 因为数组中的数字范围在1<=num<=nums.length，所以可以根据存储的数字作为索引，
     * 来将对应位置的数字变为负数，代表包含此数字下标所表示的数字
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            /**
             * 为什么要取绝对值，不是因为输入的时候有绝对值，
             * 而是因为下边你会把它变成负数，如果不取绝对值会发生异常
             */
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

}
