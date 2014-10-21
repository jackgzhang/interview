package weivretni.mixpanel;

import org.junit.Test;

import weivretni.ListNode;
import weivretni.Utils;

public class InsertIntoListTest {

    private InsertIntoList source = new InsertIntoList();

    @Test
    public void test() {

        ListNode head;
        
//        head = source.insert(Utils.getSortedList(3), 3);
//        System.out.println(head);
//
//        head = source.insert(Utils.getSortedList(7), 7);
//        System.out.println(head);
//
//        head = source.insert(Utils.getSortedList(), 12);
//        System.out.println(head);

        head = source.insert(Utils.getSortedList(), -1);
        System.out.println(head);
    }
}
