package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q083_RemoveDuplicatesfromSortedList_Test extends BaseTest {

    @Test
    public void test() {
        Q083_RemoveDuplicatesfromSortedList source = new Q083_RemoveDuplicatesfromSortedList();
        
        System.out.println(source.deleteDuplicates(this.getListNode(new int[] { 1, 2, 2, 3 })));
        System.out.println(source.deleteDuplicates(this.getListNode(new int[] { 1, 1 })));
        System.out.println(source.deleteDuplicates(this.getListNode(new int[] { 1, 2 })));
        System.out.println(source.deleteDuplicates(this.getListNode(new int[] { 1, 1, 1, 1 })));
    }
}
