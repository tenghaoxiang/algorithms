package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution105 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
        return root;

    }

    public TreeNode buildTree(int[] preorder, int startPre, int endPre, int[] inorder, int startIn, int endIn, Map<Integer, Integer> map) {

        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[startPre]);
        int i = map.get(root.val);
        root.left = buildTree(preorder, startPre + 1, startPre + i - startIn, inorder, startIn, i - 1, map);
        root.right = buildTree(preorder, startPre + i - startIn + 1, endPre, inorder, i + 1, endIn, map);
        return root;

    }

}
