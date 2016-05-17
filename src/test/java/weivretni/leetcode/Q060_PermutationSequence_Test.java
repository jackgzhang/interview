package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q060_PermutationSequence_Test {

    @Test
    public void test() {
        Q060_PermutationSequence source = new Q060_PermutationSequence();
        Assert.assertEquals("123", source.getPermutation(3, 1));
        Assert.assertEquals("132", source.getPermutation(3, 2));
        Assert.assertEquals("231", source.getPermutation(3, 4));

        Assert.assertEquals("2143", source.getPermutation(4, 8));
    }
}
