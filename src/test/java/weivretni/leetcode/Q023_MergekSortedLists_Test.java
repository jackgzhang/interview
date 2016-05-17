package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Q023_MergekSortedLists_Test extends BaseTest {

    @Test
    public void test() {
        Q023_MergekSortedLists source = new Q023_MergekSortedLists();

        List<ListNode> nodes = null;

        //
        // nodes = new ArrayList<ListNode>();
        // nodes.add(getListNode(new int[] { 1 }));
        // System.out.println(source.mergeKLists(nodes));

        
        int n = 99999;
        
        //
        nodes = new ArrayList<ListNode>();
        for (int i = 0; i < n; i++) {
            nodes.add(getListNode(new int[] { i }));
        }

        long curr = System.currentTimeMillis();
        source.mergeKLists(nodes);
        System.out.println("case 1 cost = " + (System.currentTimeMillis() - curr));

        nodes = new ArrayList<ListNode>();
        for (int i = n; i >= 0; i--) {
            nodes.add(getListNode(new int[] { i }));
        }

        curr = System.currentTimeMillis();
        System.out.println(source.mergeKLists(nodes));
        System.out.println("case 2 cost = " + (System.currentTimeMillis() - curr));
    }
}
