package weivretni.microsoft;

import org.junit.Test;

import weivretni.BaseTest;

public class MS4_Test extends BaseTest {

    private MS04 source = new MS04();

    @Test
    public void test() {
        source.findPath(this.getTreeNode1(), 5);
        System.out.println("");
        source.findPath(this.getTreeNode1(), 12);
    }
}
