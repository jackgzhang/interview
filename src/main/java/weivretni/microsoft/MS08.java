package weivretni.microsoft;

import weivretni.ListNode;

/**
 * <pre>
 *    1 用一种算法来颠倒一个链接表的顺序。现在在不用递归式的情况下做一遍。
 * 　　2 用一种算法在一个循环的链接表里插入一个节点，但不得穿越链接表。
 * 　　3 用一种算法整理一个数组。你为什么选择这种方法?
 * 　　4 用一种算法使通用字符串相匹配。
 * 　　5 颠倒一个字符串。优化速度。优化空间。
 * 　　6 颠倒一个句子中的词的顺序，比如将“我叫克丽丝”转换为“克丽丝叫我”，实现速度最快，移动最少。
 * 　　7 找到一个子字符串。优化速度。优化空间。
 * 　　8 比较两个字符串，用O(n)时间和恒量空间。
 * 　　9 假设你有一个用1001个整数组成的数组，这些整数是任意排列的，但是你知道所有的整数都在1到1000(包括1000)之间。此外，除一个数字出现两次外，其他所有数字只出现一次
 * 。假设你只能对这个数组做一次处理，用一种算法找出重复的那个数字。
 * 如果你在运算中使用了辅助的存储方式，那么你能找到不用这种方式的算法吗?
 * 　　10 不用乘法或加法增加8倍。现在用同样的方法增加7倍。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS08 {

    /**
     * 1 用一种算法来颠倒一个链接表的顺序。现在在不用递归式的情况下做一遍。
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

    // 递归
    public ListNode q1_Solution1(ListNode head) {
        ListNode tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        q1_Solution1_Helper(head);

        return tmp;
    }

    // not 递归, use 2 pointer
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
