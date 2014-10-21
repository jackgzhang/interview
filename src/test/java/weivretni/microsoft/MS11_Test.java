package weivretni.microsoft;

import junit.framework.Assert;

import org.junit.Test;

import weivretni.BaseTest;

/**
 * 
 * @author gzhang
 * 
 */
public class MS11_Test extends BaseTest {

    private MS11 source = new MS11();

    @Test
    public void test() {
        Assert.assertEquals(4, source.getMaxDistance(getTreeNode1()));

        Assert.assertEquals(6, source.getMaxDistance(getTreeNode2()));
    }
}
