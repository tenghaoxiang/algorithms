package tree;

public class AVL {

    /**
     * 所允许的最大高度差
     */
    private static final int ALLOWED_IMBALANCE = 1;

    private static class AvlNode {

        int val;
        AvlNode left;
        AvlNode right;
        int height;

        public AvlNode(int x) {
            this(x, null, null);
        }

        public AvlNode(int x, AvlNode left, AvlNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
            height = 0;
        }

    }

    private int height(AvlNode node) {
        return node == null ? -1 : node.height;
    }

    private AvlNode insert(int x, AvlNode root) {
        if (root == null) {
            return new AvlNode(x, null, null);
        }
        if (x < root.val) {
            root.left = insert(x, root.left);
        } else if (x > root.val) {
            root.right = insert(x, root.right);
        } else {

        }
        return balance(root);
    }

    private AvlNode remove(int x, AvlNode root) {

        if (root == null) {
            return null;
        }

        if (x < root.val) {
            root.left = remove(x, root.left);
        } else if (x > root.val) {
            root.right = remove(x, root.right);
        } else if (root.left != null && root.right != null) {
            root.val = findMin(root.right);
            root.right = remove(root.val, root.right);
        } else {
            root = (root.left == null) ? root.right : root.left;
        }

        return balance(root);
    }

    public static int findMin(AvlNode root) {
        if (root.left == null) {
            return root.val;
        }
        return findMin(root.left);
    }

    private AvlNode balance(AvlNode root) {
        if (root == null) {
            return null;
        }
        if (height(root.left) - height(root.right) > ALLOWED_IMBALANCE) {
            if (height(root.left.left) >= height(root.left.right)) {
                root = rotateWithLeftChild(root);
            } else {
                root = doubleWithLeftChild(root);
            }
        } else if (height(root.right) - height(root.left) > ALLOWED_IMBALANCE) {
            if (height(root.right.right) >= height(root.right.left)) {
                root = rotateWithRightChild(root);
            } else {
                root = doubleWithRightChild(root);
            }
        }
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        return root;
    }

    /**
     * 右子树长－双旋转
     * @param k3
     * @return
     */
    private AvlNode doubleWithRightChild(AvlNode k3) {
        k3.right = rotateWithLeftChild(k3.right);
        return rotateWithRightChild(k3);
    }

    /**
     * 左子树长－双旋转
     * @param k3
     * @return
     */
    private AvlNode doubleWithLeftChild(AvlNode k3) {
        k3.left = rotateWithRightChild(k3.left);
        return rotateWithLeftChild(k3);
    }

    /**
     * 左子树长－单旋转
     * @param k2
     * @return
     */
    private AvlNode rotateWithLeftChild(AvlNode k2) {
        AvlNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
        k1.height = Math.max(height(k1.left), height(k1.right)) + 1;
        return k1;
    }

    /**
     * 右子树长－单旋转
     * @param k2
     * @return
     */
    private AvlNode rotateWithRightChild(AvlNode k2) {
        AvlNode k1 = k2.right;
        k2.right = k1.left;
        k1.left = k2;
        k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
        k1.height = Math.max(height(k1.left), height(k1.right)) + 1;
        return k1;
    }

}
