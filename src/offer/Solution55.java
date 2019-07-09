package offer;

public class Solution55 {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        depth = Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
        return depth;
    }

    public boolean IsBalanced_Solution(TreeNode root) {

        if (root == null) {
            return true;
        }
        return help(root) != -1;

    }

    public int help(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int left = help(root.left);
        if (left == -1) {
            return -1;
        }
        int right = help(root.right);
        if (right == -1) {
            return -1;
        }
        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);

    }

}
