package weivretni.offer;

import junit.framework.Assert;

import org.junit.Test;

import weivretni.Node;

public class Question_23_Test {

    private Question_23 source = new Question_23();

    @Test
    public void test() {

        Node<Integer> value5 = new Node<Integer>(5, null, null);
        Node<Integer> value7 = new Node<Integer>(7, null, null);
        Node<Integer> value6 = new Node<Integer>(6, value5, value7);

        Node<Integer> value9 = new Node<Integer>(9, null, null);
        Node<Integer> value11 = new Node<Integer>(11, null, null);
        Node<Integer> value10 = new Node<Integer>(10, value9, value11);

        Node<Integer> root = new Node<Integer>(8, value6, value10);

        Assert.assertEquals("8,6,10,5,7,9,11,", source.doIt(root));
    }
}
