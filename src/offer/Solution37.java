package offer;

public class Solution37 {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    String Serialize(TreeNode root) {

        if (root == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        helpSerialize(root, stringBuilder);
        return stringBuilder.toString();

    }

    void helpSerialize(TreeNode root, StringBuilder stringBuilder) {
        if (root == null) {
            stringBuilder.append("#,");
            return;
        }
        stringBuilder.append(root.val + ",");
        helpSerialize(root.left, stringBuilder);
        helpSerialize(root.right, stringBuilder);
    }

    int index = -1;
    TreeNode Deserialize(String str) {
        if (str == null) {
            return null;
        }
        index++;
        if (index >= str.length()) {
            return null;
        }
        String[] strings = str.split(",");
        TreeNode node = null;
        if (!strings[index].equals("#")) {
            node = new TreeNode(Integer.valueOf(strings[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;

    }


}
