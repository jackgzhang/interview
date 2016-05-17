package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q019_RemoveNthNodeFromEndofList_Test extends BaseTest {

    @Test
    public void test() {
        Q019_RemoveNthNodeFromEndofList source = new Q019_RemoveNthNodeFromEndofList();
        
        
        //System.out.println(source.removeNthFromEnd(this.getListNode(new int[] { 1 }), 1));
        //System.out.println(source.removeNthFromEnd(this.getListNode(new int[] { 1, 2 }), 1));
        System.out.println(source.removeNthFromEnd(this.getListNode(new int[] { 1, 2, 3, 4, 5, 6 }), 3));

    }
}
