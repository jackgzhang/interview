package weivretni.leetcode;

import junit.framework.Assert;

import org.junit.Test;

public class AddBinary_Test {

    private Q004_AddBinary source = new Q004_AddBinary();

    @Test
    public void test() {
        Assert.assertEquals("10", source.addBinary("1", "1"));
        Assert.assertEquals("1", source.addBinary("1", "0"));
        Assert.assertEquals("11110", source.addBinary("1111", "1111"));

    }
}
