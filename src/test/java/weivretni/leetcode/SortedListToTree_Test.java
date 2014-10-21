package weivretni.leetcode;

import org.junit.Test;

import weivretni.ListNode;
import weivretni.TreeNode;

public class SortedListToTree_Test {

    private Q024_SortedListToTree source = new Q024_SortedListToTree();

    @Test
    public void test() {

        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        TreeNode root = source.sortedListToBST(node1);
        System.out.println(root);
    }
}
