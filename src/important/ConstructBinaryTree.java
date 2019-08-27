package important;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tenghaoxiang
 * @date 2019/8/27 下午4:41
 * @Description 1、根据先序遍历和中序遍历构建二叉树 2、根据后序遍历和中序遍历构建二叉树
 */
public class ConstructBinaryTree {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public TreeNode buildTree1(int[] preorder, int[] inorder) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = buildTree1(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
        return root;

    }

    public TreeNode buildTree1(int[] preorder, int startPre, int endPre, int[] inorder, int startIn, int endIn, Map<Integer, Integer> map) {

        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[startPre]);
        int i = map.get(root.val);
        root.left = buildTree1(preorder, startPre + 1, startPre + i - startIn, inorder, startIn, i - 1, map);
        root.right = buildTree1(preorder, startPre + i - startIn + 1, endPre, inorder, i + 1, endIn, map);
        return root;

    }

    public TreeNode buildTree2(int[] inorder, int[] postorder) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return null;

    }

    public TreeNode buildTree2(int[] inorder, int startIn, int endIn, int[] postorder, int startPost, int endPost, Map<Integer, Integer> map) {
        if (startIn > endIn || startPost > endPost) {
            return null;
        }
        TreeNode node = new TreeNode(postorder[endPost]);
        int i = map.get(node.val);
        node.left = buildTree2(inorder, startIn, i - 1, postorder, startPost, startPost + i - 1 - startIn, map);
        node.right = buildTree2(inorder, i + 1, endIn, postorder, startPost + i - startIn, endPost - 1, map);
        return node;
    }


}
