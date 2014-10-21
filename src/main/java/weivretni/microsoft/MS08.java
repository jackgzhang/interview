package weivretni.microsoft;

import weivretni.ListNode;

/**
 * <pre>
 *    1 ��һ���㷨���ߵ�һ�����ӱ��˳�������ڲ��õݹ�ʽ���������һ�顣
 * ����2 ��һ���㷨��һ��ѭ�������ӱ������һ���ڵ㣬�����ô�Խ���ӱ�
 * ����3 ��һ���㷨����һ�����顣��Ϊʲôѡ�����ַ���?
 * ����4 ��һ���㷨ʹͨ���ַ�����ƥ�䡣
 * ����5 �ߵ�һ���ַ������Ż��ٶȡ��Ż��ռ䡣
 * ����6 �ߵ�һ�������еĴʵ�˳�򣬱��罫���ҽп���˿��ת��Ϊ������˿���ҡ���ʵ���ٶ���죬�ƶ����١�
 * ����7 �ҵ�һ�����ַ������Ż��ٶȡ��Ż��ռ䡣
 * ����8 �Ƚ������ַ�������O(n)ʱ��ͺ����ռ䡣
 * ����9 ��������һ����1001��������ɵ����飬��Щ�������������еģ�������֪�����е���������1��1000(����1000)֮�䡣���⣬��һ�����ֳ��������⣬������������ֻ����һ��
 * ��������ֻ�ܶ����������һ�δ�����һ���㷨�ҳ��ظ����Ǹ����֡�
 * �������������ʹ���˸����Ĵ洢��ʽ����ô�����ҵ��������ַ�ʽ���㷨��?
 * ����10 ���ó˷���ӷ�����8����������ͬ���ķ�������7����
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS08 {

    /**
     * 1 ��һ���㷨���ߵ�һ�����ӱ��˳�������ڲ��õݹ�ʽ���������һ�顣
     * 
     * @param head
     * @return
     */

    private ListNode q1_Solution1_Helper(ListNode node) {
        if (node.next == null) {
            return node;
        }

        ListNode tailNode = q1_Solution1_Helper(node.next);
        tailNode.next = node;
        node.next = null;
        return node;
    }

    // �ݹ�
    public ListNode q1_Solution1(ListNode head) {
        ListNode tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        q1_Solution1_Helper(head);

        return tmp;
    }

    // not �ݹ�, use 2 pointer
    public ListNode q1_Solution2(ListNode head) {
        ListNode tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode p3 = null;
        if (p2.next != null) {
            p3 = p2.next;
        }

        p1.next = null;
        while (p3 != null) {

            p2.next = p1;

            p1 = p2;
            p2 = p3;
            p3 = p3.next;
        }

        p2.next = p1;
        return tmp;
    }
}
