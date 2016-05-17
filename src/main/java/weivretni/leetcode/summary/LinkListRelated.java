package weivretni.leetcode.summary;

import weivretni.ListNode;

import java.util.Stack;

/**
 * <pre>
 * 
 * 面试大总结之一：Java搞定面试中的链表题目
 * http://www.itint5.com/oj/#w
 * http://blog.csdn.net/fightforyourdream/article/details/16353519
 * 
 * 目录： 
 * 1. 求单链表中结点的个数: getListLength 
 * 2. 将单链表反转: reverseList（遍历），reverseListRec（递归） 
 * 3. 查找单链表中的倒数第K个结点（k > 0）: reGetKthNode 
 * 4. 查找单链表的中间结点: getMiddleNode 
 * 5. 从尾到头打印单链表: reversePrintListStack，reversePrintListRec（递归） 
 * 6. 已知两个单链表pHead1 和pHead2 各自有序，把它们合并成一个链表依然有序: mergeSortedList, mergeSortedListRec 
 * 7. 判断一个单链表中是否有环: hasCycle 
 * 8. 判断两个单链表是否相交: isIntersect 
 * 9. 求两个单链表相交的第一个节点: getFirstCommonNode 
 * 10. 已知一个单链表中存在环，求进入环中的第一个节点: getFirstNodeInCycle, getFirstNodeInCycleHashMap 
 * 11. 给出一单链表头指针pHead和一节点指针pToBeDeleted，O(1)时间复杂度删除节点pToBeDeleted: delete
 * 12. 对一个单链表原地（in-place）排序。即直接对链表结点排序。返回排序后链表的头结点。
 * 13. RemoveDuplicatesfromSortedList
 * 14 . RemoveDuplicatesfromSortedListII
 * </pre>
 * 
 * @author gzhang
 *
 */
public class LinkListRelated {

    /**
     * 1 求单链表中结点的个数 注意检查链表是否为空。时间复杂度为O（n）
     * 
     * @param head
     * @return
     */
    public int getListLength(ListNode head) {
        if (head == null) {
            return 0;
        } else {
            int len = 0;
            while (head != null) {
                head = head.next;
                len++;
            }

            return len;
        }
    }

    /**
     * 
     * <pre>
     * 2 翻转链表（递归）  
     *     // 从头到尾遍历原链表，每遍历一个结点，  
     *     // 将其摘下放在新链表的最前端。  
     *     // 注意链表为空和只有一个结点的情况。时间复杂度为O（n）
     * 
     * </pre>
     * 
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {

            ListNode tail = head.next;

            ListNode newHead = reverseList(tail);
            tail.next = head;
            head.next = null;

            return newHead;

        }
    }

    /**
     * 
     * <pre>
     * 2 翻转链表（遍历）  
     *     // 从头到尾遍历原链表，每遍历一个结点，  
     *     // 将其摘下放在新链表的最前端。  
     *     // 注意链表为空和只有一个结点的情况。时间复杂度为O（n）
     * 
     * </pre>
     * 
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {

            ListNode newHead = new ListNode(0);
            while (head != null) {
                ListNode tmp = head;
                head = head.next;

                tmp.next = newHead.next;
                newHead.next = tmp;
            }

            return newHead.next;

        }
    }

    /**
     * 3. 查找单链表中的倒数第K个结点（k > 0）
     * 
     * <pre>
     * 主要思路就是使用两个指针，先让前面的指针走到正向第k个结点 ,这样前后两个指针的距离差是k-1，之后前后两个指针一起向前走，
     * 前面的指针走到最后一个结点时，后面指针所指结点就是倒数第k个结点
     * </pre>
     * 
     * @param head
     * @param k
     * @return
     */
    public ListNode reGetKthNode(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        } else {
            int index = 0;
            ListNode p0 = head;
            ListNode p1 = head;
            // 1st pointer goto the kth node
            while (p1 != null && index < k) {
                p1 = p1.next;
                index++;
            }

            if (p1 != null) {
                while (p1 != null) {
                    p1 = p1.next;
                    p0 = p0.next;
                }

                return p0.next;
            } else {
                return null;
            }
        }
    }

    // 4. 查找单链表的中间结点
    /**
     * 此题可应用于上一题类似的思想。也是设置两个指针，只不过这里是，两个指针同时向前走，前面的指针每次走两步，后面的指针每次走一步，
     * 前面的指针走到最后一个结点时，后面的指针所指结点就是中间结点，即第（n/2+1）个结点。注意链表为空，链表结点个数为1和2的情况。时间复杂度O（n
     */
    public ListNode getMiddleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode p0 = head;
            ListNode p1 = head;
            while (p1 != null && p1.next != null) {
                p1 = p1.next.next;
                p0 = p0.next;
            }

            return p0;
        }
    }

    // 5. 从尾到头打印单链表: reversePrintListStack，reversePrintListRec（递归）
    public void reversePrintListStack(ListNode head) {
        if (head == null) {
            return;
        } else {
            Stack<ListNode> stack = new Stack<ListNode>();
            while (head != null) {
                stack.push(head);
                head = head.next;
            }

            while (!stack.isEmpty()) {
                ListNode node = stack.pop();
                System.out.print(node.val + "->");
            }
        }
        System.out.println("");
    }

    // 5. 从尾到头打印单链表: reversePrintListRec（递归）
    public void reversePrintListRec(ListNode head) {
        if (head == null) {
            return;
        } else {
            reversePrintListRec(head.next);
            System.out.print(head.val + "->");
        }
    }

    // 6. 已知两个单链表pHead1 和pHead2 各自有序，把它们合并成一个链表依然有序: mergeSortedList, mergeSortedListRec
    // 这个类似归并排序。尤其注意两个链表都为空，和其中一个为空时的情况。只需要O（1）的空间。时间复杂度为O（max(len1, len2)）
    public static ListNode mergeSortedList(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        // 先确定下来mergeHead是在哪里
        ListNode mergedHead = null;
        if (head1.val < head2.val) {
            mergedHead = head1;
            head1 = head1.next; // 跳过已经合并了的元素
            mergedHead.next = null;// 断开mergeHead和后面的联系
        } else {
            mergedHead = head2;
            head2 = head2.next; // 跳过已经合并了的元素
            mergedHead.next = null; // 断开mergeHead和后面的联系
        }

        ListNode p = mergedHead;

        // 开始合并
        while (head1 != null && head2 != null) {
            ListNode tmpNode = null;
            if (head1.val < head2.val) {
                tmpNode = head1;
                head1 = head1.next;
                tmpNode.next = null;
            } else {
                tmpNode = head2;
                head2 = head2.next;
                tmpNode.next = null;
            }
            p.next = tmpNode;
            p = p.next;
        }

        // // 合并剩余的元素
        if (head1 != null) {
            p.next = head1;
        } else {
            p.next = head2;
        }

        return mergedHead;
    }

    // 6. 已知两个单链表pHead1 和pHead2 各自有序，把它们合并成一个链表依然有序: ,mergeSortedListRec
    public static ListNode mergeSortedListRec(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        ListNode smallNode = null;
        if (head1.val < head2.val) {
            smallNode = head1;
            head1 = head1.next;
        } else {
            smallNode = head2;
            head2 = head2.next;
        }

        ListNode newHead = mergeSortedListRec(head1, head2);
        smallNode.next = newHead;
        return smallNode;

    }

    // * 7. 判断一个单链表中是否有环: hasCycle
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        } else {
            ListNode fast = head;
            ListNode slow = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (fast == slow) {
                    return true;
                }
            }

            return false;
        }
    }

    // * 8. 判断两个单链表是否相交: isIntersect 如果两个链表相交于某一节点，那么在这个相交节点之后的所有节点都是两个链表所共有的。
    // 也就是说，如果两个链表相交，那么最后一个节点肯定是共有的
    public boolean isIntersect(ListNode head1, ListNode head2) {
        return true;
    }

    // * 9. 求两个单链表相交的第一个节点: getFirstCommonNode
    /**
     * 求两个单链表相交的第一个节点 对第一个链表遍历，计算长度len1，同时保存最后一个节点的地址。
     * 对第二个链表遍历，计算长度len2，同时检查最后一个节点是否和第一个链表的最后一个节点相同，若不相同，不相交，结束。 两个链表均从头节点开始，假设len1大于len2
     * ，那么将第一个链表先遍历len1-len2个节点，此时两个链表当前节点到第一个相交节点的距离就相等了，然后一起向后遍历，直到两个节点的地址相同。
     */
    public static ListNode getFirstCommonNode(ListNode head1, ListNode head2) {
        return null;

    }

    // * 10. 已知一个单链表中存在环，求进入环中的第一个节点: getFirstNodeInCycle, getFirstNodeInCycleHashMap
    /**
     * 求进入环中的第一个节点 用快慢指针做（本题用了Crack the Coding Interview的解法，因为更简洁易懂！）
     */
    public static ListNode getFirstNodeInCycle(ListNode head) {
        return null;

    }

    /**
     * 11. 给出一单链表头指针pHead和一节点指针pToBeDeleted，O(1)时间复杂度删除节点pToBeDeleted: delete
     * 
     * <pre>
     *  对于删除节点，我们普通的思路就是让该节点的前一个节点指向该节点的下一个节点 
     * ，这种情况需要遍历找到该节点的前一个节点，时间复杂度为O(n)。对于链表， 
     * 链表中的每个节点结构都是一样的，所以我们可以把该节点的下一个节点的数据复制到该节点 
     * ，然后删除下一个节点即可。要注意最后一个节点的情况，这个时候只能用常见的方法来操作，先找到前一个节点，但总体的平均时间复杂度还是O(1)
     * </pre>
     * 
     * @param head
     * @param toDelete
     */
    public void delete(ListNode head, ListNode toDelete) {
        if (head == null || toDelete == null) {
            return;
        } else {

            // 不是尾巴
            if (toDelete.next != null) {
                ListNode next = toDelete.next;
                toDelete.val = next.val;
                toDelete.next = next.next;
            } else {
                // 是尾巴
                ListNode p = head;
                while (p.next != toDelete) {
                    p = p.next;
                }

                p.next = null;
            }
        }
    }

    /**
     * 12 对一个单链表原地（in-place）排序。即直接对链表结点排序。返回排序后链表的头结点。
     * 
     */
    public void sort(ListNode head) {

    }

}
