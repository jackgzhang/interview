package weivretni.offer;

import junit.framework.Assert;

import org.junit.Test;

public class Question_38_Test {

    private Question_38 source = new Question_38();

    @Test
    public void test() {
        // Assert.assertEquals(4, source.doIt(new int[] { 1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 9, 20 },
        // 4));
        // Assert.assertEquals(3, source.doIt(new int[] { 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9, 20 },
        // 4));
        // Assert.assertEquals(1, source.doIt(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20 }, 4));
        Assert.assertEquals(0, source.doIt(new int[] { 1, 2, 3 }, 4));
    }
}
