package weivretni.offer;

import weivretni.Node;
import weivretni.Utils;

public class Question_6 {

    public Node<Integer> doIt(int[] pre, int[] in) {

        if (pre.length == 0) {
            return null;
        } else if (pre.length == 1) {
            return new Node<Integer>(pre[pre.length - 1], null, null);
        } else {
            int pivotV = pre[0];

            // locate the pivot in the pre order array
            int index = 0;
            while (in[index] != pivotV) {
                index++;
            }

            Node<Integer> root = new Node<Integer>(pivotV, null, null);

            Node<Integer> left = doIt(Utils.subArray(pre, 1, index), Utils.subArray(in, 0, index - 1));
            Node<Integer> right = doIt(Utils.subArray(pre, index + 1, pre.length - 1), Utils.subArray(in, index + 1, in.length - 1));

            root.setLeft(left);
            root.setRight(right);

            return root;
        }
    }

}
