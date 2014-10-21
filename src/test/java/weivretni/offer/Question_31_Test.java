package weivretni.offer;

import junit.framework.Assert;

import org.junit.Test;

public class Question_31_Test {

    private Question_31 source = new Question_31();

    @Test
    public void test() {

        // Version 2
        Assert.assertSame(source.version1(new int[] { 2, -1 }), source.version2(new int[] { 2, -1 }));
        Assert.assertSame(source.version1(new int[] { -1, 2 }), source.version2(new int[] { -1, 2 }));
        Assert.assertSame(source.version1(new int[] { 1, -2, 3 }), source.version2(new int[] { 1, -2, 3 }));
        Assert.assertSame(source.version2(new int[] { 1, -2, 3, 13, -4, 7, 2, -5 }), source.version2(new int[] { 1, -2, 3, 13, -4, 7, 2, -5 }));
        Assert.assertSame(source.version2(new int[] { 1, 2 }), source.version2(new int[] { 1, 2 }));
    }
}
