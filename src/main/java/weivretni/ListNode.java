package weivretni;

public class ListNode {
    public int      val;
    public ListNode next;
    public ListNode pre;

    public int key;
    
    public ListNode() {

    }

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(val);

        if (next != null) {
            sb.append("->").append(next.toString());
        }

        
        return sb.toString();

    }
}