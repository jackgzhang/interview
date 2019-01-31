package weivretni.leetcode;

import weivretni.ListNode;

/**
 * Delete Node in a Linked List
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 *
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3,
 * the linked list should become 1 -> 2 -> 4 after calling your function.
 *
 * 题目是让删除链表中的指定结点，这个结点不是尾结点。
 *
 * 要求时间复杂度是O(1)
 *
 * 我们通常的想法是：要删除链表的一个结点node，必须找到node的前驱结点pre，使用pre.next = node.next才能删除。
 * 但是单链表不遍历的话，是无法找到pre的，所以时间复杂度是O(n)。
 *
 * 要删除node，我们为什么不利用后继结点succ呢？
 *
 * 我们可以把succ的值复制到node中，然后删除succ！
 */
public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}