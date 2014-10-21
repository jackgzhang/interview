package weivretni.common;

import junit.framework.Assert;

import org.junit.Test;

import weivretni.BaseTest;

public class TreeRoot2LeaftDistance_Test extends BaseTest{

    private TreeRoot2LeaftDistance souce = new TreeRoot2LeaftDistance();

    @Test
    public void test() {
        Assert.assertEquals(2, souce.getShortestDistance(this.getTreeNode1()));
    }
}
