package weivretni.leetcode;//package weivretni.leetcode;

import weivretni.ListNode;
import weivretni.TreeNode;

/**
 * Given a singly linked list where elements are sorted in ascending order,
 * <p>
 * convert it to a height balanced BST.
 * <p>
 * Best Solution: bottom-up
 *
 * @author gzhang
 */
public class Q109_ConvertSortedListToBinarySearchTree {

    private ListNode listNode;

    public TreeNode sortedListToBST(ListNode head) {
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        listNode = head;
        return convert(0, length - 1);
    }


    private TreeNode convert(int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;

        TreeNode left = convert(start, mid - 1);
        TreeNode parent = new TreeNode(listNode.val);
        parent.left = left;

        listNode = listNode.next;
        parent.right = convert(mid + 1, end);

        return parent;
    }
}
