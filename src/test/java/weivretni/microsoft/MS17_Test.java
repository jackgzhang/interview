package weivretni.microsoft;

import junit.framework.Assert;

import org.junit.Test;

public class MS17_Test {

    @Test
    public void test() {
        MS17 source = new MS17();

        Assert.assertSame('c', source.find(new char[] { 'a', 'b', 'c', 'a', 'b', 'd' }));
    }
}
