package weivretni.mixpanel;

import weivretni.ListNode;
import weivretni.TreeNode;

/**
 * http://www.interviewzen.com/question/dwxgcd
 * <p>
 * Given a sorted singly linked list, create a balanced binary search tree
 * 
 * @author gzhang
 * 
 */
public class BalancedBinarySearchTree {

    private ListNode findMiddle(ListNode head) {
        if (head.next == null) {
            return head;
        } else if (head.next.next == null) {
            return head;
        } else {
            ListNode head2 = head;
            while (head2.next != null && head2.next.next != null) {
                head = head.next;
                head2 = head2.next;
                head2 = head2.next;
            }

            return head;
        }
    }

    private TreeNode getTreeNode(int val) {
        TreeNode treeNode = new TreeNode(val);
        return treeNode;
    }

    public TreeNode convert(int[] numbers, int start, int end) {

        if (end == start) {
            return getTreeNode(numbers[start]);
        } else if (end == start + 1) {
            TreeNode root = getTreeNode(numbers[start]);
            TreeNode leaf = getTreeNode(numbers[end]);
            root.right = leaf;
            return root;
        } else {

            int middle = start + (end - start) / 2;

            TreeNode root = getTreeNode(numbers[middle]);

            TreeNode left = convert(numbers, start, middle - 1);
            TreeNode right = convert(numbers, middle + 1, end);

            root.left = left;
            root.right = right;
            return root;
        }
    }
}
