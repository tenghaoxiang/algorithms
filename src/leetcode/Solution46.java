package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution46 {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        backtrack(res, new ArrayList<>(), nums);
        return res;

    }

    public void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (list.contains(nums[i])) {
                    continue;
                }
                list.add(nums[i]);
                backtrack(res, list, nums);
                list.remove(list.size() - 1);
            }
        } 
        
    }

}