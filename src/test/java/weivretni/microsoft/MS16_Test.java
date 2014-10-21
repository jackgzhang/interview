package weivretni.microsoft;

import junit.framework.Assert;

import org.junit.Test;

import weivretni.BaseTest;

public class MS16_Test extends BaseTest {

    private MS16 source = new MS16();

    @Test
    public void test() {
        Assert.assertEquals("3 2 5 1 4 6 ", source.print(this.getTreeNode1()));
        Assert.assertEquals("3 5 4 6 2 7 1 8 ", source.print(this.getTreeNode2()));
    }
}
