package weivretni.microsoft;

import junit.framework.Assert;

import org.junit.Test;

import weivretni.BaseTest;
import weivretni.ListNode;

public class MS7_Test extends BaseTest {

    private MS07 source = new MS07();

    @Test
    public void test() {

        // Case 1, not cross at all
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        Assert.assertFalse(source.isCross(l1, a1));

        // Case2, one cross, one not
        l6.next = l4;
        Assert.assertFalse(source.isCross(l1, a1));

        // Case3, both circle, but not cross;
        a5.next = a2;
        Assert.assertFalse(source.isCross(l1, a1));

        // Case4, both circle, Do cross;
        a5.next = l2;
        Assert.assertTrue(source.isCross(l1, a1));

        // Case5. Both not circe, do Cross;
        l6.next = null;
        Assert.assertTrue(source.isCross(l1, a1));

    }
}
