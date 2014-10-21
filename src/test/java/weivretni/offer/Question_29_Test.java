package weivretni.offer;

import junit.framework.Assert;

import org.junit.Test;

public class Question_29_Test {

    private Question_29 source = new Question_29();

    @Test
    public void test() {
        Assert.assertEquals(2, source.solution1(new int[] { 2, 2, 7, 4, 8, 3, 2, 2, 2 }));
        Assert.assertEquals(2, source.solution2(new int[] { 2, 2, 7, 4, 8, 3, 2, 2, 2 }));
    }
}
