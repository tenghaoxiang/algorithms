import java.util.Scanner;

/**
 * @author tenghaoxiang
 * @date 2019/9/15 下午7:26
 * @Description 明天拿出自己的最高水平
 */
public class Main {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    static int max = 0;

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode left2 = new TreeNode(3);
        TreeNode left3 = new TreeNode(4);
        TreeNode right1 = new TreeNode(5);
        root.left = left1;
        left1.left = left2;
        left1.right = left3;
        root.right = right1;
        length(root.left, 1);
        length(root.right, 1);
        System.out.println(max);

    }

    public static int length(TreeNode root, int height) {

        if (root == null) {
            return height;
        }
        int left = length(root.left, height + 1);
        int right = length(root.right, height + 1);
        if (left + right - 2 * height > max) {
            max = left + right - 2 * height;
        }
        return Math.max(left, right);

    }

}
