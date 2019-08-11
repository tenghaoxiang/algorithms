package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/11 上午9:21
 * @Description
 */
public class KthNode {

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    int n = 0;
    public TreeNode KthNode(TreeNode root, int k) {

        if (root == null) {
            return null;
        }
        TreeNode node = KthNode(root.left, k);
        if (node != null) {
            return node;
        }
        n++;
        if(n == k){
            return root;
        }
        node = KthNode(root.right, k);
        if (node != null) {
            return node;
        }
        return null;

    }

}
