package weivretni.lintcode;

import org.junit.Assert;
import org.junit.Test;

public class Backpack_Test {

    @Test
    public void test() {
        Backpack source = new Backpack();

        Assert.assertSame(4, source.backPack(4, new int[] { 1, 1, 2, 2 }));

        Assert.assertSame(10, source.backPack(90, new int[] { 12, 3, 7, 4, 5, 13, 2, 8, 4, 7, 6, 5, 7 }));
        // Assert.assertSame(10, source.backPack(90, new int[] { 12, 3, 7, 4, }));
        // Assert.assertSame(10, source.backPack(10, new int[] { 3, 4, 8, 5 }));
    }
}
