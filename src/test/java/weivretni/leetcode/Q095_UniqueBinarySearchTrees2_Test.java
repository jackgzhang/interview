package weivretni.leetcode;

import org.junit.Test;
import weivretni.TreeNode;

import java.util.List;

public class Q095_UniqueBinarySearchTrees2_Test {

    private Q095_UniqueBinarySearchTrees2 source = new Q095_UniqueBinarySearchTrees2();

    @Test
    public void test() {
        printTree(source.generateTrees(3));

    }

    private void printTree(List<TreeNode> nodes) {
        for (TreeNode root : nodes) {
            System.out.println(root);
            System.out.println("========");
        }
    }

}
