package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution107 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        help(res, root, 0);
        return res;

    }

    public void help(List<List<Integer>> res, TreeNode root, int height) {
        if (root == null) {
            return;
        }
        if (height == res.size()) {
            res.add(0, new ArrayList<>());
        }
        help(res, root.left, height + 1);
        help(res, root.right, height + 1);
        res.get(res.size() - height - 1).add(root.val);
    }

}
