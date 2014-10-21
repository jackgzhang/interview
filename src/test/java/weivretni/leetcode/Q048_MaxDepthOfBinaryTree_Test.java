package weivretni.leetcode;

import junit.framework.Assert;

import org.junit.Test;

import weivretni.TreeNode;

public class Q048_MaxDepthOfBinaryTree_Test {

    private Q048_MaxDepthOfBinaryTree source = new Q048_MaxDepthOfBinaryTree();

    @Test
    public void test() {

        /**
         * <pre>
         *      3
         *   2     4
         * 1
         * </pre>
         */
        TreeNode root = new TreeNode(3);
        TreeNode left2 = new TreeNode(2);
        TreeNode left1 = new TreeNode(1);
        TreeNode right4 = new TreeNode(4);

        root.left = left2;
        root.right = right4;
        left2.left = left1;
        
        Assert.assertSame(3, source.maxDepth(root));

    }
}
