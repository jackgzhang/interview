package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;
import weivretni.BaseTest;

/**
 * Created by gzhang on 5/11/16.
 */
public class Q302_DistinctSubsequences_Test extends BaseTest {
    @Test
    public void test() {
        Q302_DistinctSubsequences source = new Q302_DistinctSubsequences();
        Assert.assertEquals(3, source.numDistinct("rabbbit", "rabbit"));

    }
}
