package weivretni.offer;

import java.util.LinkedList;
import java.util.Queue;

import weivretni.Node;

public class Question_23 {

    public String doIt(Node<Integer> root) {

        StringBuffer sb = new StringBuffer();
        Queue queue = new LinkedList<Integer>();

        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = (Node) queue.poll();
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }

            if (node.getRight() != null) {
                queue.add(node.getRight());
            }

            sb.append(node.getValue()).append(",");
        }

        return sb.toString();
    }
}
