package weivretni.offer;

import org.junit.Test;

import weivretni.Node;

public class Question_5_Test {

    private Question_5 source = new Question_5();

    @Test
    public void test() {
        Node<Integer> value1 = new Node<Integer>(1, null);
        Node<Integer> value2 = new Node<Integer>(2, value1);
        Node<Integer> value3 = new Node<Integer>(3, value2);
        Node<Integer> value4 = new Node<Integer>(4, value3);

        source.doIt(value4);
    }
}
