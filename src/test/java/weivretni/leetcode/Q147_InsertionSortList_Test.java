package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q147_InsertionSortList_Test extends BaseTest {

    private Q147_InsertionSortList source = new Q147_InsertionSortList();

    @Test
    public void test() {
        System.out.println(source.insertionSortList(this.getListNode(new int[] { -2147483647, Integer.MIN_VALUE })));
        System.out.println(source.insertionSortList(this.getListNode(new int[] { 1, 2, 3, 4, 6, 5 })));
        System.out.println(source.insertionSortList(this.getListNode(new int[] { 6, 5 })));
    }
}
