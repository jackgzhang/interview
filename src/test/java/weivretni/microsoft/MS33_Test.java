package weivretni.microsoft;

import junit.framework.Assert;

import org.junit.Test;

public class MS33_Test {

    private MS33 source = new MS33();

    @Test
    public void test() {
        // Assert.assertEquals("cba", source.find("abbccba", "abc"));
        Assert.assertEquals("cba", source.find2("abbccba", "abc"));
        Assert.assertEquals("cba", source.find2("abbccbabc", "abc"));
        Assert.assertEquals("cba", source.find2("abbccbabbc", "abc"));
        
        Assert.assertEquals("cba", source.find("abbccba", "abc"));
        Assert.assertEquals("cba", source.find("abbccbabc", "abc"));
        Assert.assertEquals("cba", source.find("abbccbabbc", "abc"));
    }
}
