package offer;

import java.util.Deque;
import java.util.LinkedList;

public class Solution36 {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public TreeNode Convert(TreeNode pRootOfTree) {

        if (pRootOfTree == null) {
            return null;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        help(pRootOfTree, deque);
        TreeNode res = deque.poll();
        res.left = null;
        TreeNode cur = res;
        TreeNode node;
        while (!deque.isEmpty()) {
            node = deque.poll();
            cur.right = node;
            node.left = cur;
            cur = node;
        }
        return res;

    }

    public void help(TreeNode root, Deque<TreeNode> deque) {
        if (root == null) {
            return;
        }
        help(root.left, deque);
        deque.addLast(root);
        help(root.right, deque);
    }

}
