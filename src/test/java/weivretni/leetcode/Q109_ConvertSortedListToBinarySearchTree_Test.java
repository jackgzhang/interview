package weivretni.leetcode;//package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.ListNode;

public class Q109_ConvertSortedListToBinarySearchTree_Test extends BaseTest {

    private Q109_ConvertSortedListToBinarySearchTree source2 = new Q109_ConvertSortedListToBinarySearchTree();
    private Q108_ConvertSortedArrayToBinarySearchTree source1 = new Q108_ConvertSortedArrayToBinarySearchTree();

    @Test
    public void test() {
        int[] array = new int[]{1,2,3,4,5};
        ListNode list = this.buildListNode(array);
        assertEquals(source1.sortedArrayToBST(array), source2.sortedListToBST(list));

        array = new int[]{1,2,3,4,5,6,7,8};
        list = this.buildListNode(array);
        assertEquals(source1.sortedArrayToBST(array), source2.sortedListToBST(list));

    }
}
