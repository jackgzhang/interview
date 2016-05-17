package weivretni;

public class TreeLinkNode {

    public int val;
    public TreeLinkNode left, right, next;

    public TreeLinkNode(int x) {
        val = x;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("   " + val + "--" + (next == null ? "\n" : next.val + "\n"));
        sb.append(left == null ? "__" : left.val);
        sb.append("---");
        sb.append(right == null ? "__" : right.val);
        return sb.toString();
    }
}
