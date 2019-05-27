package offer;

public class Solution26 {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int x) {
            this.val = x;
        }
    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {

        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            if (isEqual(root1, root2)) {
                return true;
            }
        }
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    public boolean isEqual(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isEqual(root1.left, root2.left) && isEqual(root1.right, root2.right);
    }

}
