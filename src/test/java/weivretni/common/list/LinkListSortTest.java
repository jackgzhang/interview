package weivretni.common.list;

import org.junit.Test;

import weivretni.BaseTest;
import weivretni.ListNode;

public class LinkListSortTest extends BaseTest{

    private LinkListSort source = new LinkListSort();

    @Test
    public void test() {
        ListNode node = source.sort(getListNode2());
        System.out.println(node);
    }
}
