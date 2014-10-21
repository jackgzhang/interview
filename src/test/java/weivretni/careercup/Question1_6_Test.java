package weivretni.careercup;

import junit.framework.Assert;

import org.junit.Test;

public class Question1_6_Test {

    private Question1_6 source = new Question1_6();

    @Test
    public void testFibonacci() {
        Assert.assertEquals(0, source.add(0, 0));
        Assert.assertEquals(1, source.add(0, 1));
        Assert.assertEquals(2, source.add(1, 1));
        Assert.assertEquals(5, source.add(2, 3));
        Assert.assertEquals(70, source.add(30, 40));
        Assert.assertEquals((35 + 99), source.add(35, 99));
    }
}
