package weivretni.offer;

import junit.framework.Assert;

import org.junit.Test;

public class Question_8_Test {

    private Question_8 source = new Question_8();

    @Test
    public void test() {
        Assert.assertSame(1, source.doIt(new int[] { 3, 4, 5, 1, 2 }));
        Assert.assertSame(1, source.doIt(new int[] { 7, 8, 1, 2, 3, 4, 5, 6 }));
        Assert.assertSame(0, source.doIt(new int[] { 1, 0, 1, 1, 1 }));
        Assert.assertSame(0, source.doIt(new int[] { 1, 1, 1, 0, 1 }));
    }
}
