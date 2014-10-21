package weivretni.offer;

import org.junit.Test;

import weivretni.Node;
import weivretni.Utils;

public class Question_6_Test {

    private Question_6 source = new Question_6();

    @Test
    public void test() {
        Node root = source.doIt(new int[] { 1, 2, 4, 7, 3, 5, 6, 8 }, new int[] { 4, 7, 2, 1, 5, 3, 6, 8 });

        Utils.preOrderTraverseTree(root);

        System.out.println("==");

        Utils.inOrderTraverseTree(root);

    }
}
