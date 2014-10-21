package weivretni.microsoft;

import junit.framework.Assert;

import org.junit.Test;

public class M25_Test {

    private MS25 source = new MS25();

    @Test
    public void test() {
        Assert.assertEquals("123", source.findMax("123a"));
        Assert.assertEquals("34567", source.findMax("123abc345678"));
        Assert.assertEquals("12345678", source.findMax("abcd12345ed125ss123456789"));
    }
}
