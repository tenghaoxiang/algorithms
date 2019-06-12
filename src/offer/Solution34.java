package offer;

import java.util.ArrayList;

public class Solution34 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
        }
    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        help(res, new ArrayList<Integer>(), root, target);
        return res;

    }

    public void help(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, TreeNode root, int target) {
        if (root == null) {
            return;
        }
        if (root.val > target) {
            return;
        }
        if (root.val == target && root.left == null && root.right == null) {
            list.add(root.val);
            res.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        } else if (root.val == target) {
            return;
        }
        if (root.val < target) {
            list.add(root.val);
            target = target - root.val;
            help(res, list, root.left, target);
            help(res, list, root.right, target);
            list.remove(list.size() - 1);
        }
    }

}
