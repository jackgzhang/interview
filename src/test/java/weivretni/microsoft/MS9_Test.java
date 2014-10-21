package weivretni.microsoft;

import junit.framework.Assert;

import org.junit.Test;

public class MS9_Test {

    private MS09 source = new MS09();

    @Test
    public void test() {
        //Assert.assertTrue(source.isTrue(new int[] { 5, 7, 6, 9, 11, 10, 8 }));
        Assert.assertFalse(source.isTrue(new int[] { 7, 4, 6, 5 }));
    }
}
