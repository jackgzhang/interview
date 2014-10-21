package weivretni.mixpanel;

import weivretni.ListNode;

/**
 * Implement a queue by using two stacks which are in turn implemented by linked lists.
 * 
 * @author gzhang
 * 
 */

class MStack {

    private ListNode head;
    private ListNode tail;

    public void push(int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = tail.next;
        }

    }

    public int pop() {
        if (head != null) {
            int value = head.val;
            head = head.next;
            return value;
        } else {
            throw new RuntimeException("End of stack");
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}

public class MQueue {

    private MStack inbox  = new MStack();
    private MStack outbox = new MStack();

    public void enqueue(int item) {
        inbox.push(item);
    }

    public int dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }

    public boolean isEmpty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }
}
