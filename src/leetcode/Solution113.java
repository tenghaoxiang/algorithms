package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution113 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum){

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentResult = new ArrayList<>();
        pathSum(root, sum, currentResult, result);
        return result;

    }

    public void pathSum(TreeNode root, int sum, List<Integer> currentResult, List<List<Integer>> result) {

        if (root == null) {
            return;
        }
        /**
         * 在函数中，增加和删除集合中的元素均只进行一次
         */
        currentResult.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            result.add(new ArrayList<>(currentResult));
        } else {
            pathSum(root.left, sum - root.val, currentResult, result);
            pathSum(root.right, sum - root.val, currentResult, result);
        }
        currentResult.remove(currentResult.size() - 1);

    }

}
