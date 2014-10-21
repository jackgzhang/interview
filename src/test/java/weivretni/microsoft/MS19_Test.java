package weivretni.microsoft;

import junit.framework.Assert;

import org.junit.Test;

public class MS19_Test {

    private MS19 source = new MS19();

    @Test
    public void test() {
        Assert.assertEquals(source.method1(4), source.method2(4));
        Assert.assertEquals(source.method1(40), source.method2(40));
    }
}
