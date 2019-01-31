package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.ListNode;

public class Q021_MergeTwoSortedLists_Test extends BaseTest {

    private Q021_MergeTwoSortedLists source = new Q021_MergeTwoSortedLists();

    @Test
    public void test() {
        assertEquals(new ListNode(1,2), source.mergeTwoLists(new ListNode(1), new ListNode(2)));
        assertEquals(new ListNode(1,2,3,4), source.mergeTwoLists(new ListNode(1,4), new ListNode(2,3)));
        assertEquals(new ListNode(1,2,3,4,5,6), source.mergeTwoLists(new ListNode(1,4,5), new ListNode(2,3,6)));

    }
}
