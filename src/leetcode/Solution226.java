package leetcode;

public class Solution226 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {

        reverse(root);
        return root;

    }

    public void reverse(TreeNode node) {
        if (node == null) {
            return;
        }
        reverse(node.left);
        reverse(node.right);
        TreeNode treeNode = node.left;
        node.left = node.right;
        node.right = treeNode;
    }

}
