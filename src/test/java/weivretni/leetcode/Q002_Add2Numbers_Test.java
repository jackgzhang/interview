package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.ListNode;

public class Q002_Add2Numbers_Test extends BaseTest {

    private Q002_Add2Numbers source = new Q002_Add2Numbers();

    @Test
    public void test() {
        assertEquals(getListNode(new int[]{2, 4, 6, 8, 0, 3,1}), source.addTwoNumbers(getListNode(new int[]{1, 2, 3, 4, 5, 6}), getListNode(new int[]{1, 2, 3, 4, 5, 6})));
        assertEquals(getListNode(new int[]{0,1}), source.addTwoNumbers(getListNode(new int[]{5}), getListNode(new int[]{5})));
    }
}
