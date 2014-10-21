package weivretni.common.tree;

import junit.framework.Assert;

import org.junit.Test;

import weivretni.BaseTest;

public class CountCompleteBinayTreeNodesTest extends BaseTest{

    private CountCompleteBinayTreeNodes source = new CountCompleteBinayTreeNodes();

    @Test
    public void test() {
        Assert.assertEquals(6, source.counter(this.getCompleteBinaryTree1()));
    }
}
