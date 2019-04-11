package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution106 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int startIn, int endIn, int[] postorder, int startPost, int endPost, Map<Integer, Integer> map) {
        if (startIn > endIn || startPost > endPost) {
            return null;
        }
        TreeNode node = new TreeNode(postorder[endPost]);
        int i = map.get(node.val);
        node.left = buildTree(inorder, startIn, i - 1, postorder, startPost, startPost + i - 1 - startIn, map);
        node.right = buildTree(inorder, i + 1, endIn, postorder, startPost + i - startIn, endPost - 1, map);
        return node;
    }

}
