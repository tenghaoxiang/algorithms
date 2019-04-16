package leetcode;

import java.util.Stack;

public class Solution114 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
        }
    }

    /**
     * Recursive递归
     */
//    public void flatten(TreeNode root) {
//        flatten(root, null);
//    }
//
//    private TreeNode flatten(TreeNode root, TreeNode pre) {
//        if (root == null) return pre;
//        pre = flatten(root.right, pre);
//        pre = flatten(root.left, pre);
//        root.right = pre;
//        root.left = null;
//        pre = root;
//        return pre;
//    }

    /**
     * Iteration迭代
     */
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
            if (!stack.isEmpty()) {
                current.right = stack.peek();
            }
            current.left = null;
        }
    }

}
