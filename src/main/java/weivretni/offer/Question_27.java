package weivretni.offer;

import weivretni.Node;

/**
 * <pre>
 * 题目：输入一棵二元树的根结点，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）
 * 形成树的一条路径，最长路径的长度为树的深度。
 * 最长路径的长度为树的深度。
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
