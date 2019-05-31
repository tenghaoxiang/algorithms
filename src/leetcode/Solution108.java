package leetcode;

public class Solution108 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {

        return help(nums, 0, nums.length - 1);

    }

    public TreeNode help(int[] nums, int start, int end) {

        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = help(nums, start, mid - 1);
        root.right = help(nums, mid + 1, end);
        return root;

    }

}
