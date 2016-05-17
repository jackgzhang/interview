package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.ListNode;

public class Q143_ReorderList_Test extends BaseTest {

    @Test
    public void test() {
        Q143_ReorderList source = new Q143_ReorderList();

        ListNode head = null;

        head = this.getListNode(new int[] { 1, 2, 3, 4, 5 });

        source.reorderList(head);
        System.out.println(head);
    }
}
