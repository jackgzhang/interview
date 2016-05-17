package weivretni.leetcode;

import org.junit.Test;
import weivretni.TreeNode;

import java.util.List;

public class Q107_BinaryTreeLevelOrderTraversal2_Test {

    private Q107_BinaryTreeLevelOrderTraversal2 source = new Q107_BinaryTreeLevelOrderTraversal2();

    @Test
    public void test() {
        /**
         * <pre>
         *      3
         *   2      5
         * 1     4     6
         * </pre>
         */
        TreeNode root = new TreeNode(3);
        TreeNode left2 = new TreeNode(2);
        TreeNode left1 = new TreeNode(1);
        TreeNode left4 = new TreeNode(4);
        TreeNode right5 = new TreeNode(5);
        TreeNode right6 = new TreeNode(6);

        root.left = left2;
        root.right = right5;
        left2.left = left1;
        right5.right = right6;
        right5.left = left4;

        List res = source.levelOrderBottom(root);
        System.out.println(res);
    }
}
