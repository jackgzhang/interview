package weivretni.leetcode;

import weivretni.ListNode;

/**
 * Sort a linked list using insertion sort.
 * 
 * 
 * <pre>
 * 
 * http://huntfor.iteye.com/blog/2072912
 * 
 * 起一个新头， 逐渐 把 旧的list 的元素 加到 新头的list。
 * 然后 返回 新头 的 下 一个 元素
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q147_InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newVirtualHead = new ListNode(Integer.MIN_VALUE); // <- 新头

        newVirtualHead.next = head; // 新头 -> head -> 2 -> 3 -> ....

        ListNode curr = newVirtualHead.next;
        while (curr != null) {
            while (curr.next != null && curr.next.val >= curr.val) {
                curr = curr.next;
            }

            if (curr.next != null) {
                ListNode previousSmallerNode = newVirtualHead;
                while (!previousSmallerNode.equals(curr)) {
                    
                    ListNode swapNode = curr.next;
                    
                    if (previousSmallerNode.val < swapNode.val && previousSmallerNode.next.val > swapNode.val) {
                        // Swap
                        ListNode swapNodeNext = swapNode.next;
                        ListNode preNext = previousSmallerNode.next;
                        
                        previousSmallerNode.next = swapNode;
                        swapNode.next = preNext;
                        curr.next = swapNodeNext;
                        break;
                    } else {
                        previousSmallerNode = previousSmallerNode.next;
                    }
                }
            }else{
                break;
            }
        }

        return newVirtualHead.next;
    }

}
