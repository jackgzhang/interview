package weivretni.leetcode;//package weivretni.leetcode;

import junit.framework.Assert;

import org.junit.Test;

import weivretni.BaseTest;

public class Q007_BalancedTree_Test extends BaseTest {

    private Q007_BalancedTree source = new Q007_BalancedTree();

    @Test
    public void test() {
        Assert.assertEquals(true, source.isBalanced2(this.buildTree(new String[]{"1"})));
        Assert.assertEquals(source.isBalanced2(this.getTreeNode1()), source.isBalanced(this.getTreeNode1()));
        Assert.assertEquals(source.isBalanced2(this.getTreeNode2()), source.isBalanced(this.getTreeNode2()));
    }
}
