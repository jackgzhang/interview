package weivretni.offer;

import weivretni.Node;

public class Question_5 {

    public void doIt(Node node) {
        if (node.getNext() != null) {
            doIt(node.getNext());
        }
        System.out.println(node.getValue());
    }
}
