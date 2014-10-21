package weivretni;

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
}