package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution98 {

    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
        }

    }

    /**
     * 采用递归
     */
    public boolean isValidBST(TreeNode root) {
        return help(root, null, null);
    }

    public boolean help(TreeNode p, Integer low, Integer high) {
        if (p == null) {
            return true;
        }
        return (low == null || p.val > low) && (high == null || p.val < high) && help(p.left, low, p.val) && help(p.right, p.val, high);
    }

    /**
     * 才用链表保存节点
     * @param root
     * @return
     */
//    public boolean isValidBST(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        help(root, list);
//        int size = list.size();
//        for (int i = 0; i < size - 1; i++) {
//            if (list.get(i) >= list.get(i + 1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public void help(TreeNode root, List<Integer> list) {
//        if (root == null) {
//            return;
//        }
//        help(root.left, list);
//        list.add(root.val);
//        help(root.right, list);
//    }

}
