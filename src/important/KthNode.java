package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/10 下午2:09
 * @Description 找到二叉搜索树中找到第K大节点
 */
public class KthNode {

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    int n = 0;
    public TreeNode KthNode(TreeNode root, int k) {

        if (root == null || k <= 0) {
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
