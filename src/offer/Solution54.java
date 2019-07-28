package offer;

/**
 * @author tenghaoxiang
 * @date 19-7-28 下午9:38
 * @Description 找出二叉搜索树的第K大结点
 */
public class Solution54 {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    int n = 0;
    TreeNode KthNode(TreeNode pRoot, int k) {

        if (pRoot != null) {
            TreeNode node = KthNode(pRoot.left, k);
            if (node != null) {
                return node;
            }
            n++;
            if (n == k) {
                return pRoot;
            }
            node = KthNode(pRoot.right, k);
            if (node != null) {
                return node;
            }
        }
        return null;

    }

}
