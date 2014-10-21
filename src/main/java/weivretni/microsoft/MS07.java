package weivretni.microsoft;

import weivretni.ListNode;

/**
 * http://blog.csdn.net/shiren_bod/article/details/6651703
 * 
 * <pre>
 * ΢����Ժ֮����ж����������Ƿ��ཻ
 * �����������������ͷָ�룬����h1��h2���ж������������Ƿ��ཻ��
 * Ϊ�˼����⣬���Ǽ��������������������
 * 
 * ������չ��
 * 1.�����������л���?
 * 2.�����Ҫ������������ཻ�ĵ�һ���ڵ���?
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS07 {

    private ListNode crossNode1 = null;
    private ListNode crossNode2 = null;

    /**
     * If it is circle, return null, otherwise, return last Node
     * 
     * @param l
     * @return
     */
    private ListNode isCircle(ListNode l, int i) {
        ListNode slow = l;
        ListNode fast = l.next;

        while (slow != fast && fast != null && slow != null) {

            if (fast.next != null) {
                fast = fast.next;
            } else {
                return fast;
            }

            slow = slow.next;
            fast = fast.next;
        }

        if (i == 1) {
            crossNode1 = fast;
        } else {
            crossNode2 = fast;
        }

        return null;

    }

    public boolean isCross(ListNode l1, ListNode l2) {
        ListNode lastNode1 = isCircle(l1, 1);
        ListNode lastNode2 = isCircle(l2, 2);

        if (lastNode1 != null && lastNode2 != null) {
            return lastNode1.equals(lastNode2);
        }

        if (lastNode1 == null && lastNode2 == null) {
            // �������л����жϻ���Ľڵ��Ƿ��ܵ�����һ��������Ľڵ�

            ListNode tmp = crossNode1.next;

            while (tmp != crossNode1) {
                if (tmp == crossNode2) {
                    return true;
                }
                tmp = tmp.next;
            }

            return false;
        } else {
            return false;
        }

    }
}
