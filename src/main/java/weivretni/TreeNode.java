package weivretni;

import java.util.Stack;

public class TreeNode {

    public int      val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;

    public TreeNode(int x) {
        val = x;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("   " + val + "\n");
        sb.append(left == null ? "__" : left.val);
        sb.append("---");
        sb.append(right == null ? "__" : right.val);
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TreeNode) {

            Stack<TreeNode> s1 = new Stack<TreeNode>();
            Stack<TreeNode> s2 = new Stack<TreeNode>();

            TreeNode t1 = this;
            TreeNode t2 = (TreeNode) obj;
            // Inorder traversal to compare
            while (true) {
                while (t1 != null) {
                    s1.push(t1);
                    t1 = t1.left;
                }

                while (t2 != null) {
                    s2.push(t2);
                    t2 = t2.left;
                }

                if (s1.isEmpty() || s1.isEmpty()) {
                    break;
                }

                t1 = s1.pop();
                t2 = s2.pop();

                if (t1 != null && t2 != null) {
                    if (t1.val != t2.val) {
                        return false;
                    }
                }

                if (t1 == null || t2 == null) {
                    return false;
                }

                t1 = t1.right;
                t2 = t2.right;
            }

            if (s1.isEmpty() && s2.isEmpty()) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

}