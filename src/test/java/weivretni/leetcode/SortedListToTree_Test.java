package weivretni.leetcode;

import org.junit.Test;
import weivretni.ListNode;
import weivretni.TreeNode;

public class SortedListToTree_Test {

    private Q024_SortedListToTree source = new Q024_SortedListToTree();

    @Test
    public void test() {
        TreeNode root = source.sortedListToBST(new ListNode(new int[]{1,2}));
        System.out.println(root);
        root = source.sortedListToBST(new ListNode(new int[]{1,2,3,4,5}));
        System.out.println(root);
        root = source.sortedListToBST(new ListNode(new int[]{1,2,3,4,5,6}));
        System.out.println(root);
        root = source.sortedListToBST(new ListNode(new int[]{1,2,3,4,5,6,7}));
        System.out.println(root);
    }
}
