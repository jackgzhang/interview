package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q011_BinarySearchTreeIterator_Test extends BaseTest {

    @Test
    public void test() {

        Q173_BinarySearchTreeIterator source = new Q173_BinarySearchTreeIterator(this.buildTree(new String[] { "8" }));

        while (source.hasNext()) {
            System.out.println(source.next());
        }

        source = new Q173_BinarySearchTreeIterator(this.buildTree(new String[] { "8", "3", "10", "1", "6", "14" }));
        while (source.hasNext()) {
            System.out.println(source.next());
        }
    }
}
