package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q116_PopulatingNextRightPointersinEachNode_Test extends BaseTest {

    @Test
    public void test() {
        Q116_PopulatingNextRightPointersinEachNode source = new Q116_PopulatingNextRightPointersinEachNode();

        //source.connect(this.buildLinkedTree(new String[] { "1" }));

        source.connect(this.buildLinkedTree(new String[] { "1", "2", "3" }));
    }
}
