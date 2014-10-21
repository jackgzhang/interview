package weivretni.careercup;

import junit.framework.Assert;

import org.junit.Test;

public class Question1_1_Test {

    private Question1_1 source = new Question1_1();

    @Test
    public void testFibonacci() {
        Assert.assertEquals(0, source.recursive(0));
        Assert.assertEquals(1, source.recursive(1));
        Assert.assertEquals(1, source.recursive(2));
        Assert.assertEquals(2, source.recursive(3));
        Assert.assertEquals(3, source.recursive(4));
        Assert.assertEquals(5, source.recursive(5));
        Assert.assertEquals(8, source.recursive(6));
        Assert.assertEquals(13, source.recursive(7));
        Assert.assertEquals(21, source.recursive(8));
        Assert.assertEquals(34, source.recursive(9));

        Assert.assertEquals(0, source.iterative(0));
        Assert.assertEquals(1, source.iterative(1));
        Assert.assertEquals(1, source.iterative(2));
        Assert.assertEquals(2, source.iterative(3));
        Assert.assertEquals(3, source.iterative(4));
        Assert.assertEquals(5, source.iterative(5));
        Assert.assertEquals(8, source.iterative(6));
        Assert.assertEquals(13, source.iterative(7));
        Assert.assertEquals(21, source.iterative(8));
        Assert.assertEquals(34, source.iterative(9));
    }
}
