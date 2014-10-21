package weivretni.common;

import junit.framework.Assert;

import org.junit.Test;

public class IntegerReverse_Test {

    public IntegerReverse source = new IntegerReverse();

    @Test
    public void test() {
//        Assert.assertSame(123, source.reverse(321));
//        Assert.assertEquals(12345, source.reverse(54321));
        
        
        Assert.assertEquals(-12345, source.reverse(-54321));
    }
}
