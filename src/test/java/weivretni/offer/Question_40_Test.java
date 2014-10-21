package weivretni.offer;

import junit.framework.Assert;

import org.junit.Test;

public class Question_40_Test {

    private Question_40 source = new Question_40();

    @Test
    public void test() {
        Assert.assertEquals(1, source.doIt(new Integer[] { 2, 2, 3, 3, 4, 4, 1 }));
        Assert.assertEquals(4, source.doIt(new Integer[] { 2, 2, 3, 3, 1, 4, 1 }));

        Assert.assertEquals("4,5".intern(), source.doIt2(new int[] { 2, 2, 3, 3, 1, 4, 1, 5 }).intern());
    }
}
