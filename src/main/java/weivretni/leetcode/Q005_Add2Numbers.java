package weivretni.leetcode;

import weivretni.Node;

/**
 * <pre>
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q005_Add2Numbers {

    public Node<Integer> doIt(Node<Integer> l1, Node<Integer> l2) {

        Node<Integer> root = null;
        Node<Integer> current = null;
        int carry = 0;

        while (l1 != null || l2 != null) {
            Node<Integer> node = new Node<Integer>();

            int tmp = (l1 == null ? 0 : l1.getValue()) + (l2 == null ? 0 : l2.getValue()) + carry;

            if (tmp >= 10) {
                tmp = tmp - 10;
                carry = 1;
            }else{
                carry = 0;
            }

            node.setValue(tmp);

            if (root == null) {
                root = node;
                current = root;
            } else {
                current.setNext(node);
                current = node;
            }

            if (l1 != null)
                l1 = l1.getNext();

            if (l2 != null)
                l2 = l2.getNext();
        }

        return root;
    }
}
