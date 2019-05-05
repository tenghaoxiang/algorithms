package tree;

/**
 * 有关二叉查找树的相关操作
 */
public class BinaryTree {

    private static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
        }

    }

    private static TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public static boolean contains(int x) {
        return contains(x, root);
    }

    public static boolean contains(int x, TreeNode root) {
        if (root == null) {
            return false;
        }
        if (x < root.val) {
            return contains(x, root.left);
        } else if (x > root.val) {
            return contains(x, root.right);
        } else {
            return true;
        }
    }

    /**
     * 递归求二叉查找树中的最小值
     *
     * @return
     */
    public static int findMin(TreeNode root) {
        if (root == null) {
            try {
                throw new Exception("此树为空");
            } catch (Exception e) {
                System.out.println("此树为空");
            }
        }
        if (root.left == null) {
            return root.val;
        }
        return findMin(root.left);
    }

    /**
     * 非递归找出二叉查找树中的最大值
     * @param root
     * @return
     * @throws Exception
     */
    public static int findMax(TreeNode root) {
        if (root != null) {
            while (root.right != null) {
                root = root.right;
            }
        }
        return root.val;
    }

    public static TreeNode insert(int x) {
        return insert(x, root);
    }

    public static TreeNode insert(int x, TreeNode root) {
        if (root == null) {
            return new TreeNode(x);
        }
        if (x < root.val) {
            root.left = insert(x, root.left);
        } else if (x > root.val) {
            root.right = insert(x, root.right);
        } else {

        }
        return root;
    }

    public static TreeNode remove(int x) {
        return remove(x, root);
    }

    public static TreeNode remove(int x, TreeNode root) {
        if (root == null) {
            return null;
        }
        if (x < root.val) {
            root.left = remove(x, root.left);
        } else if (x > root.val) {
            root.right = remove(x, root.right);
        } else {
            if (root.left != null && root.right != null) {
                root.val = findMin(root.right);
                root.right = remove(root.val, root.right);
            } else {
                root = root.left == null ? root.right : root.left;
            }
        }
        return root;
    }

}
