package weivretni.offer;

import junit.framework.Assert;

import org.junit.Test;

public class Question_24_Test {

    private Question_24 source = new Question_24();

    @Test
    public void test() {
        Assert.assertEquals(true, source.doIt(new int[] { 5, 7, 6 }));
        Assert.assertEquals(true, source.doIt(new int[] { 5, 7, 6, 9, 11, 10, 8 }));
        Assert.assertEquals(false, source.doIt(new int[] { 7, 4, 6, 5, }));
    }
}
