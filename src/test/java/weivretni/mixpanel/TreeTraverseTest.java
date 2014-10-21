package weivretni.mixpanel;

import org.junit.Test;

import weivretni.ListNode;
import weivretni.Utils;
import weivretni.mixpanel.TreeTraverse;

public class TreeTraverseTest {

    private TreeTraverse  source  = new TreeTraverse();

    private TreeTraverse2 source2 = new TreeTraverse2();

    @Test
    public void test1() {
        ListNode head = source.preOrderTraverse(Utils.getBinaryTree1());
        while (head.pre != null) {
            head = head.pre;
        }
        System.out.println("Pre " + head);

        head = source.inOrderTraverse(Utils.getBinaryTree1());
        while (head.pre != null) {
            head = head.pre;
        }
        System.out.println("In " + head);

        head = source.postOrderTraverse(Utils.getBinaryTree1());
        while (head.pre != null) {
            head = head.pre;
        }
        System.out.println("Post " + head);
    }

    @Test
    public void test2() {
        source2.preOrder(Utils.getBinaryTree1());
        System.out.println("");
        source2.inOrder(Utils.getBinaryTree1());
    }
}
