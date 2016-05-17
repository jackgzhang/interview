package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

/**
 * Created by gzhang on 5/12/16.
 */
public class Q092_ReverseLinkedList_Test extends BaseTest {
    @Test
    public void test() {
        Q092_ReverseLinkedList source = new Q092_ReverseLinkedList();

        this.assertEquals(getListNode(new int[]{2, 1}), source.reverse(getListNode(new int[]{1, 2})));
        this.assertEquals(getListNode(new int[]{4, 3, 2, 1}), source.reverse(getListNode(new int[]{1, 2, 3, 4})));
    }
}
