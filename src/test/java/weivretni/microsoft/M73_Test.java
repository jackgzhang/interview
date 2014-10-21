package weivretni.microsoft;

import junit.framework.Assert;

import org.junit.Test;


public class M73_Test {
    private MS73 source = new MS73();
    
    @Test
    public void test() {
        Assert.assertSame(4, source.find("google"));
        Assert.assertSame(2, source.find("abb"));
        Assert.assertSame(6, source.find("abbcaxxac"));
    }
}
