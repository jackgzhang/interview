package weivretni.microsoft;

import junit.framework.Assert;

import org.junit.Test;

public class MS28_Test {

    private MS28 source = new MS28();

    @Test
    public void test() {
//        Assert.assertEquals(2, source.find(10));
//        Assert.assertEquals(3, source.find(21));
        Assert.assertEquals(3, source.find(-2));
    }
}
