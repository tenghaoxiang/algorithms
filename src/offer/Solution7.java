package offer;

public class Solution7 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        TreeNode node = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return node;

    }

    public TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {

        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode node = new TreeNode(pre[startPre]);
        for (int i = startIn; i <=endIn ; i++) {
            if (in[i] == pre[startPre]) {
                node.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                node.right = reConstructBinaryTree(pre, startPre + i - startIn + 1, endPre, in, i + 1, endIn);
                break;
            }
        }
        return node;

    }

}


