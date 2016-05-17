package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q025_ReverseNodesinkGroup_Test extends BaseTest {

    @Test
    public void test() {
        Q025_ReverseNodesinkGroup source = new Q025_ReverseNodesinkGroup();

        System.out.println(source.reverseKGroup(this.getListNode(new int[] { 1, 2, 3, 4 }), 2));
        System.out.println(source.reverseKGroup(this.getListNode(new int[] { 1, 2, 3, 4, 5 }), 2));
        System.out.println(source.reverseKGroup(this.getListNode(new int[] { 1, 2, 3, 4, 5 }), 4));

    }
}
