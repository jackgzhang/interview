package weivretni.mixpanel;

import weivretni.ListNode;

/**
 * http://www.interviewzen.com/question/dF3PJq
 * 
 * <p>
 * 
 * 
 * Insert an element into a sorted doubly linked list, so that the list remains sorted
 * 
 * @author gzhang
 * 
 */
public class InsertIntoList {

    private void insertHelper(ListNode head, int value, int length) {

        // Edge case handle 
        if (value < head.val) {
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head.pre = newNode;
            return;
        }
        
        
        // Walk to the middle , compare middle with the middle+1
        int counter = 0;
        ListNode traveler = head;
        while (counter <= length / 2 && traveler.next != null) {
            traveler = traveler.next;
            counter++;
        }
        
        
        if (traveler.next == null && traveler.val < value) {
            // reaches end
            ListNode newNode = new ListNode(value);
            newNode.pre = traveler;
            traveler.next = newNode;
            return;
        }

        // Insert into Right
        if (value > traveler.val) {
            if (traveler.next == null || traveler.next.val > value) {
                ListNode newNode = new ListNode(value);

                ListNode tmp = traveler.next;

                traveler.next = newNode;
                newNode.pre = traveler;

                if (tmp != null) {
                    newNode.next = tmp;
                    tmp.pre = newNode;
                }

            } else if (traveler.next.val < value) {
                // Keep searching the right side
                insertHelper(traveler, value, length / 2);
            }
        }
        // Insert into Left
        else if (value < traveler.val) {
            if (traveler.pre == null || traveler.pre.val < value) {
                ListNode newNode = new ListNode(value);

                ListNode tmp = traveler.pre;

                traveler.pre = newNode;
                newNode.next = traveler;

                if (tmp != null) {
                    tmp.next = newNode;
                    newNode.pre = tmp;
                }

            } else if (traveler.pre.val > value) {
                // Keep searching the left side
                insertHelper(head, value, length / 2);
            }
        }
    }

    public ListNode insert(ListNode head, int value) {
        if (head == null) {
            ListNode newNode = new ListNode(value);
            head = newNode;
            return head;
        } else {
            int length = 1;
            ListNode walker = head;
            while (walker.next != null) {
                length++;
                walker = walker.next;
            }

            insertHelper(head, value, length);

            return head;
        }

    }
}
