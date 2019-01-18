package weivretni.common;

import org.junit.Assert;
import org.junit.Test;

public class FindMissingNumber_Test {

    private FindMissingNumber source = new FindMissingNumber();

    @Test
    public void test() {
        Assert.assertSame(2, source.missingNumber(new int[] { 0, 1, 3 }));
        Assert.assertSame(7, source.missingNumber(new int[] { 0, 1, 2, 3, 4, 5, 6, 8 }));
        Assert.assertSame(1, source.missingNumber(new int[] { 0, 2, 3, 4, 5, 6, 7, 8 }));
    }

}
