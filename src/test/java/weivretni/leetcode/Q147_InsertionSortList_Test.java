package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.ListNode;

public class Q147_InsertionSortList_Test extends BaseTest {

    private Q147_InsertionSortList source = new Q147_InsertionSortList();

    @Test
    public void test() {
        assertEquals(new ListNode(new int[]{1,2,3}), source.insertionSortList(new ListNode((new int[] { 3,1,2 }))));
        assertEquals(new ListNode(new int[]{1,2}), source.insertionSortList(new ListNode((new int[] { 1,2 }))));
        assertEquals(new ListNode(new int[]{1,2,3,4}), source.insertionSortList(new ListNode((new int[] { 1,2,4,3 }))));
    }
}
