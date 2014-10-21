package weivretni.microsoft;

import junit.framework.Assert;

import org.junit.Test;

public class MS12_Test {

    private MS12 source = new MS12();

    @Test
    public void test() {
        Assert.assertEquals(55, source.solve(10));

        Assert.assertEquals(5050, source.solve(100));
    }
}
