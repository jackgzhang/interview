package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.ListNode;

public class Q160_IntersectionOfTwoLinkedLists_Test extends BaseTest {

    @Test
    public void test() {
        Q160_IntersectionOfTwoLinkedLists source = new Q160_IntersectionOfTwoLinkedLists();

        ListNode node1 = this.getListNode(new int[] { 1, 2, 3, 4, 54 });

        ListNode node2 = this.getListNode(new int[] { 3 });

        System.out.println(source.getIntersectionNode(node1, node2));
        
        ListNode node3 = this.getListNode(new int[] { 4 });
        
        System.out.println(source.getIntersectionNode(node3, node2));

    }
}
