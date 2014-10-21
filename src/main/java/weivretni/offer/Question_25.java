package weivretni.offer;

import weivretni.Node;


public class Question_25 {

    public boolean doIt(Node<Integer> root, int total) {
        if (root.isLeaf()) {
            if (root.getValue().equals(total)) {
                System.out.println(root.getValue());
                return true;
            } else {
                return false;
            }
        } else {

            boolean leftResult = false;
            boolean rightResult = false;

            if (doIt(root.getLeft(), total - root.getValue())) {
                System.out.println(root.getValue());
                leftResult = true;
            }

            if (doIt(root.getRight(), total - root.getValue())) {
                System.out.println(root.getValue());
                rightResult = true;
            }

            return leftResult || rightResult;
        }
    }
}
