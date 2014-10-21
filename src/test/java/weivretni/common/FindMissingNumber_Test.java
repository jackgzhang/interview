package weivretni.common;

import org.junit.Assert;
import org.junit.Test;

public class FindMissingNumber_Test {

    private FindMIssingNumber source = new FindMIssingNumber();

    @Test
    public void test() {
        Assert.assertSame(7, source.doIt(new int[] { 1, 2, 3, 4, 5, 7, 8 }));
        Assert.assertSame(8, source.doIt(new int[] { 1, 2, 3, 4, 5, 6, 8 }));
        Assert.assertSame(2, source.doIt(new int[] { 2, 3, 4, 5, 6, 7, 8 }));
    }

}
