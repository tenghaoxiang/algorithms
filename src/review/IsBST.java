package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/21 上午8:38
 * @Description
 */
public class IsBST {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public boolean isValidBST(TreeNode root) {

        return help(root, null, null);

    }

    public boolean help(TreeNode node, Integer low, Integer high) {

        if (node == null) {
            return true;
        }
        return (low == null || node.val > low) && (high == null || node.val < high) && help(node.left, low, node.val) && help(node.right, node.val, high);

    }

}
