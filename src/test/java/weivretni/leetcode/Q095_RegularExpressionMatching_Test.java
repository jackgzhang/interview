package weivretni.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gzhang on 11/16/14.
 */
public class Q095_RegularExpressionMatching_Test {

    @Test
    public void test() {
        Q095_RegularExpressionMatching source = new Q095_RegularExpressionMatching();

        Assert.assertEquals(false, source.isMatch("abc", "ab*"));
        Assert.assertEquals(true, source.isMatch("abc", "abc*"));
        Assert.assertEquals(true, source.isMatch("abc", ".*"));
        Assert.assertEquals(true, source.isMatch("abc", "abc"));
        Assert.assertEquals(true, source.isMatch("abc", "ab."));

    }
}
