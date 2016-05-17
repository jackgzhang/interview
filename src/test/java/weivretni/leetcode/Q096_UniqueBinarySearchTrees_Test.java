package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q096_UniqueBinarySearchTrees_Test {

    @Test
    public void test() {
        Q096_UniqueBinarySearchTrees source = new Q096_UniqueBinarySearchTrees();

        Assert.assertEquals(1, source.numTrees(1));
        Assert.assertEquals(5, source.numTrees(3));
        Assert.assertEquals(2, source.numTrees(2));
        Assert.assertEquals(5, source.numTrees(3));
        Assert.assertEquals(14, source.numTrees(4));
    }
}
