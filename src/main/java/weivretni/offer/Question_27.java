package weivretni.offer;

import weivretni.Node;

/**
 * <pre>
 * ��Ŀ������һ�ö�Ԫ���ĸ���㣬���������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩
 * �γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * �·���ĳ���Ϊ������ȡ�
 * </pre>
 * 
 * @author gzhang
 * 
 */

public class Question_27 {

    private Node<Integer> getRightMost(Node<Integer> node) {
        while (node.getRight() != null) {
            node = node.getRight();
        }

        return node;
    }

    private Node<Integer> getLeftMost(Node<Integer> node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }

        return node;
    }

    /**
     * Return the head Node<Integer>
     * 
     * @return
     */
    public Node<Integer> doIt(Node<Integer> root) {
        if (root.isLeaf()) {
            return root;
        } else {
            doIt(root.getLeft());
            doIt(root.getRight());

            Node<Integer> right = getRightMost(root.getLeft());
            Node<Integer> left = getLeftMost(root.getRight());

            right.setRight(root);
            root.setLeft(right);

            left.setLeft(root);
            root.setRight(left);

            return getLeftMost(root);

        }
    }
}
