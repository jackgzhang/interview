package weivretni.offer;

import junit.framework.Assert;

import org.junit.Test;

public class Question_44_Test {

    private Question_44 source = new Question_44();

    @Test
    public void test() {
        Assert.assertEquals(true, source.doIt(new int[] { 1, 5, 0, 3, 0 }));
    }
}
