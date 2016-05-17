package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q148_SortList_Test extends BaseTest {

    @Test
    public void test() {
        Q148_SortList source = new Q148_SortList();

        System.out.println(source.sortList(this.getListNode(new int[] { 12, 4 })));
        System.out.println(source.sortList(this.getListNode(new int[] { 12, 4, 1, 6, 100, 54, 2 })));

    }
}
