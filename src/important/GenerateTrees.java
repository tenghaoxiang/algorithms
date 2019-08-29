package important;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tenghaoxiang
 * @date 2019/8/29 下午10:01
 * @Description
 */
public class GenerateTrees {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public List<TreeNode> generateTrees(int n) {

        if (n == 0) {
            List<TreeNode> list = new ArrayList<>();
            return list;
        }
        return genTrees(1, n);

    }

    public List<TreeNode> genTrees(int start, int end) {

        List<TreeNode> list = new ArrayList<>();
        if (start > end) {
            list.add(null);
            return list;
        }
        List<TreeNode> left, right;
        for (int i = start; i < end; i++) {
            left = genTrees(start, i - 1);
            right = genTrees(i + 1, end);
            for (TreeNode lnode : left) {
                for (TreeNode rnode : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    list.add(root);
                }
            }
        }
        return list;

    }

}
