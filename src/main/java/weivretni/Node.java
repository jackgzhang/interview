package weivretni;

public class Node<T> {

    private T       value;
    private Node<T> left;
    private Node<T> right;

    public Node() {

    }

    public Node(T value, Node<T> left, Node<T> right) {
        super();
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(T value, Node<T> next) {
        super();
        this.value = value;
        this.right = next;
    }

    public Node<T> getLeft() {
        return left;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public boolean isLeaf() {
        return (this.right == null && this.left == null);
    }

    // ///// Sumulate a link list
    public void setNext(Node<T> next) {
        this.right = next;
    }

    public Node<T> getNext() {
        return this.right;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(value).append("\n");
        sb.append(left == null ? "_" : left.getValue()).append("-----");
        sb.append(right == null ? "_" : right.getValue());
        
        return sb.toString();
    }
}
