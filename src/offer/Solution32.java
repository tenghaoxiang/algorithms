package offer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution32 {

    class TreeNode{
        int val = 0;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.addLast(root);
        while (!linkedList.isEmpty()) {
            root = linkedList.removeFirst();
            list.add(root.val);
            if (root.left != null) {
                linkedList.addLast(root.left);
            }
            if (root.right != null) {
                linkedList.addLast(root.right);
            }
        }
        return list;

    }

}
