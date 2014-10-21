package weivretni.offer;

import junit.framework.Assert;

import org.junit.Test;

public class Question_22_Test {

    private Question_22 source = new Question_22();

    @Test
    public void test() {
        Assert.assertEquals(true, source.doIt(new int[] { 1, 2, 3, 4, 5 }, new int[] { 4, 5, 3, 2, 1 }));
        Assert.assertEquals(false, source.doIt(new int[] { 1, 2, 3, 4, 5 }, new int[] { 5, 3, 4, 2, 1 }));
    }
}
