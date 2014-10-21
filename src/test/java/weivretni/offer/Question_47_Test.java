package weivretni.offer;

import junit.framework.Assert;

import org.junit.Test;

public class Question_47_Test {

    private Question_47 source = new Question_47();

    @Test
    public void test() {
        Assert.assertEquals(3, source.doIt(1, 2));
        Assert.assertEquals(22, source.doIt(5, 17));
        Assert.assertEquals(17, source.doIt(10, 7));
    }
}
