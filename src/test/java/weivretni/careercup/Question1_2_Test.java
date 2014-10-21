package weivretni.careercup;

import junit.framework.Assert;

import org.junit.Test;

public class Question1_2_Test {

    private Question1_2 source = new Question1_2();

    @Test
    public void testFibonacci() {
        Assert.assertEquals(0, source.count2BrutalForce(0));
        Assert.assertEquals(0, source.count2BrutalForce(1));
        Assert.assertEquals(1, source.count2BrutalForce(2));
        Assert.assertEquals(1, source.count2BrutalForce(3));
        Assert.assertEquals(1, source.count2BrutalForce(4));
        Assert.assertEquals(1, source.count2BrutalForce(8));
        Assert.assertEquals(1, source.count2BrutalForce(9));

        Assert.assertEquals(2, source.count2BrutalForce(12));
        Assert.assertEquals(2, source.count2BrutalForce(16));
        Assert.assertEquals(3, source.count2BrutalForce(20));
        Assert.assertEquals(6, source.count2BrutalForce(22));
        Assert.assertEquals(14, source.count2BrutalForce(35));
        Assert.assertEquals(300, source.count2BrutalForce(1000));
    }
}
