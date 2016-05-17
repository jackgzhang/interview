package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q024_SwapNodesInPairs_Test extends BaseTest {

    @Test
    public void test() {
        Q024_SwapNodesInPairs source = new Q024_SwapNodesInPairs();

//        System.out.println(source.swapPairs(this.getListNode(new int[] { 1 })));
        System.out.println(source.swapPairs(this.getListNode(new int[] { 1, 2 })));
        System.out.println(source.swapPairs(this.getListNode(new int[] { 1, 2, 3 })));
        System.out.println(source.swapPairs(this.getListNode(new int[] { 1, 2, 3, 4, 5 })));

    }
}
