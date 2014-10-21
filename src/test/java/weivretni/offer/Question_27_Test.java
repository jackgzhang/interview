package weivretni.offer;

import org.junit.Test;

import weivretni.Node;

public class Question_27_Test {

    private Question_27 source = new Question_27();

    @Test
    public void test() {
        /**
         *     10
         *  5       12
         *4   7 
         */
        Node<Integer> value4 = new Node<Integer>(4, null, null);
        Node<Integer> value7 = new Node<Integer>(7, null, null);
        Node<Integer> value5 = new Node<Integer>(5, value4, value7);

        Node<Integer> value12 = new Node<Integer>(12, null, null);

        Node<Integer> root = new Node<Integer>(10, value5, value12);
        
        root = source.doIt(root);
        
        while (root != null) {
            System.out.println(root.getValue());
            root = root.getRight();
        }
    }
}
