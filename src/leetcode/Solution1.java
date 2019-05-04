package leetcode;

import java.util.HashMap;

public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                if (res[0] != res[1]) {
                    return res;
                }
            }
        }
        return res;
    }

    /**
     * 这个方法比较耗时，但是我想不出更好的办法了。。。
     * 嘿嘿，又想到了
     */
//    public int[] twoSum(int[] nums, int target) {
//
//        int[] res = new int[2];
//        final int length = nums.length;
//        for (int i = 0; i < length; i++) {
//            for (int j = i + 1; j < length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    res[0] = i;
//                    res[1] = j;
//                    return res;
//                }
//            }
//        }
//        return res;
//
//    }

}
