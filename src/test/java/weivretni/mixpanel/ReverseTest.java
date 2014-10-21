package weivretni.mixpanel;

import org.junit.Test;

import weivretni.ListNode;
import weivretni.Utils;
import weivretni.mixpanel.Reverse;

public class ReverseTest {

    private Reverse source = new Reverse();

    @Test
    public void test1() {
        ListNode head = Utils.getSortedList();
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        source.reverse1(head);
        System.out.println(tail);
    }
    
    
    @Test
    public void test2() {
        ListNode head = Utils.getSortedList();
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        source.reverse2(head);
        System.out.println(tail);
    }

}
