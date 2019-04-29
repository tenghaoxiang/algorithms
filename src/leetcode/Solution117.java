package leetcode;

public class Solution117 {

    class Node{
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {

        }

        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }

    public Node connect(Node root) {

        if (root == null) {
            return null;
        }
        Node head = root;
        Node cur = null;
        Node pre = null;
        while (head != null) {

            cur = head;
            pre = null;
            head = null;
            while (cur != null) {
                if (cur.left != null) {
                    if (pre != null) {
                        pre.next = cur.left;
                    } else {
                        head = cur.left;
                    }
                    pre = cur.left;
                }
                if (cur.right != null) {
                    if (pre != null) {
                        pre.next = cur.right;
                    } else {
                        head = cur.right;
                    }
                    pre = cur.right;
                }
                cur = cur.next;
            }


        }
        return root;

    }

}
