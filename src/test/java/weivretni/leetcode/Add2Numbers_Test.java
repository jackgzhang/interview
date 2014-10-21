package weivretni.leetcode;

import org.junit.Test;

import weivretni.Node;

public class Add2Numbers_Test {

    private Q005_Add2Numbers source = new Q005_Add2Numbers();

    @Test
    public void test() {

        Node<Integer> n3 = new Node<Integer>(3, null);
        Node<Integer> n2 = new Node<Integer>(2, n3);
        Node<Integer> n4 = new Node<Integer>(4, n2);

        Node<Integer> n5 = new Node<Integer>(5, null);
        Node<Integer> n6 = new Node<Integer>(6, n5);
        Node<Integer> n7 = new Node<Integer>(7, n6);
        Node<Integer> n8 = new Node<Integer>(8, n7);

        Node<Integer> node = source.doIt(n4, n8);
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}
