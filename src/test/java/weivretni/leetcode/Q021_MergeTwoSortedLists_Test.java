package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q021_MergeTwoSortedLists_Test extends BaseTest {

    private Q021_MergeTwoSortedLists source = new Q021_MergeTwoSortedLists();

    @Test
    public void test() {
        System.out.println(source.mergeTwoLists(this.getListNode(new int[] { 1 }), getListNode(new int[] {})));
        System.out.println(source.mergeTwoLists(this.getListNode(new int[] {}), getListNode(new int[] { 0 })));
        System.out.println(source.mergeTwoLists(this.getListNode(new int[] { 1, 3, 5 }), getListNode(new int[] { 2, 4, 6, 8 })));
    }
}
