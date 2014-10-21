package weivretni.microsoft;

import junit.framework.Assert;

import org.junit.Test;

public class MS29_Test {

    private MS29 source = new MS29();

    @Test
    public void test() {
        Assert.assertTrue(source.IsPossiblePopOrder("12345", "54321"));
        Assert.assertTrue(source.IsPossiblePopOrder("12345", "45321"));
        Assert.assertFalse(source.IsPossiblePopOrder("12345", "43512"));
    }
}
