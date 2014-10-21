package weivretni.offer;

import java.util.concurrent.atomic.AtomicInteger;

import weivretni.Node;

public class Question_39 {

    public int doIt(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftMax = doIt(root.getLeft());
            int rightMax = doIt(root.getRight());

            return 1 + Math.max(leftMax, rightMax);
        }
    }

    public boolean isBalanced(Node root, AtomicInteger depth) {
        if (root == null) {
            depth.set(0);
            return true;
        } else {
            AtomicInteger left = new AtomicInteger(0);
            AtomicInteger right = new AtomicInteger(0);
            if (isBalanced(root.getLeft(), left) && isBalanced(root.getRight(), right)) {
                if (Math.max(left.intValue(), right.intValue()) - Math.min(left.intValue(), right.intValue()) <= 1) {
                    depth.set(1 + Math.max(left.intValue(), right.intValue()));
                    return true;
                }
            }

            return false;
        }
    }

    /**
     * Question 2. Judge a balanced banary tree
     */
    public boolean doIt2(Node root) {
        return isBalanced(root, new AtomicInteger(0));
    }
}
