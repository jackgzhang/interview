package weivretni.geek4geek;

import junit.framework.Assert;

import org.junit.Test;

public class Question_DP_EditDistance_Test {

    private DP_5_EditDistance source = new DP_5_EditDistance();

    @Test
    public void test() {
        Assert.assertEquals(1, source.doIt("ab", "b"));
        Assert.assertEquals(2, source.doIt("abc", "c"));
        Assert.assertEquals(1, source.doIt("s1", "s2"));
        Assert.assertEquals(1, source.doIt("s12", "s2"));
    }
}
