package offer;

public class Solution28 {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    boolean isSymmetrical(TreeNode pRoot) {

        if (pRoot == null) {
            return true;
        }
        return compare(pRoot.left, pRoot.right);

    }

    public boolean compare(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return compare(left.right, right.left) && compare(left.left, right.right);

    }

}
