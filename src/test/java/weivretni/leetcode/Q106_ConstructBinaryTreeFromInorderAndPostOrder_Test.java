package weivretni.leetcode;

import org.junit.Test;
import weivretni.TreeNode;

public class Q106_ConstructBinaryTreeFromInorderAndPostOrder_Test {

    private Q106_ConstructBinaryTreeFromInorderAndPostOrder source = new Q106_ConstructBinaryTreeFromInorderAndPostOrder();

    @Test
    public void test() {

        TreeNode answers = null;

        answers = source.buildTree(new int[] { 2, 1, 3 }, new int[] { 2, 3, 1 });

        System.out.println(answers);
        
        answers = source.buildTree(new int[] { 4, 2, 5, 1, 6, 3, 7 }, new int[] { 4, 5, 2, 6, 7, 3, 1 });

        System.out.println(answers);

    }
}
