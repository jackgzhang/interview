package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.ListNode;

public class Q086_PartitionList_Test extends BaseTest {

    @Test
    public void test() {
        Q086_PartitionList source = new Q086_PartitionList();

        ListNode node = this.getListNode(new int[] { 3, 1, 2 });

        System.out.println(source.partition(node, 3));
    }
}
