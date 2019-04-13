package leetcode;

public class Solution700 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
        }
    }

    /**
     * 递归recursion
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(root.val == val){
            return root;
        }
        else{
            return val<root.val? searchBST(root.left,val):searchBST(root.right,val);
        }
    }

    /**
     * 迭代iteration
     */
//    public TreeNode searchBST(TreeNode root, int val) {
//        while(root != null && root.val != val){
//            root = val<root.val? root.left:root.right;
//        }
//        return root;
//    }

}
