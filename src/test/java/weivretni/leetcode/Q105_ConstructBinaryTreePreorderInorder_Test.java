package weivretni.leetcode;

import org.junit.Test;
import weivretni.TreeNode;

public class Q105_ConstructBinaryTreePreorderInorder_Test {

    private Q105_ConstructBinaryTreePreorderInorder source = new Q105_ConstructBinaryTreePreorderInorder();

    @Test
    public void test() {

        TreeNode answers = null;

        answers = source.buildTree(new int[] { 1, 2, 3 }, new int[] { 2, 1, 3 });

        System.out.println(answers);

        answers = source.buildTree(new int[] { 1, 2, 4, 6, 7, 5, 3 }, new int[] { 6, 4, 7, 2, 5, 1, 3 });

        System.out.println(answers);

    }
}
