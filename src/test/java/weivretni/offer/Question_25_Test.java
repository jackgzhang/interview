package weivretni.offer;

import junit.framework.Assert;

import org.junit.Test;

import weivretni.Node;

public class Question_25_Test {

    private Question_25 source = new Question_25();

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

        Assert.assertEquals(true, source.doIt(root,22));
        Assert.assertEquals(false, source.doIt(root,20));
        
        
    }
}
