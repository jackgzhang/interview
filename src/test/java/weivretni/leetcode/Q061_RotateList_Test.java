package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q061_RotateList_Test extends BaseTest {

    @Test
    public void test() {
        Q061_RotateList source = new Q061_RotateList();

        System.out.println(source.rotateRight(this.getListNode(new int[] { 1, 2 }), 2));
        System.out.println(source.rotateRight(this.getListNode(new int[] { 1, 2, 3, 4, 5 }), 2));
    }
}
