package weivretni;

public class ListNode {
    public int      val;
    public ListNode next;
    public ListNode pre;

    public int key;
    
    public ListNode() {

    }

    public ListNode(int... x) {
        this.val = x[0];
        if (x.length > 1) {
            ListNode p = this;
            for (int i = 1; i< x.length; i++) {
                p.next = new ListNode(x[i]);
                p = p.next;
            }
        }
    }

    public ListNode(int x) {
        val = x;
        next = null;
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