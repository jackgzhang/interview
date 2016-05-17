package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q071_SimplifyPath_Test {

    @Test
    public void test() {
        Q071_SimplifyPath source = new Q071_SimplifyPath();

        Assert.assertEquals("/", source.simplifyPath("/.//../../"));
        Assert.assertEquals("/a/b", source.simplifyPath("/a//b"));
        Assert.assertEquals("/home", source.simplifyPath("/home/"));
        Assert.assertEquals("/c", source.simplifyPath("/a/./b/../../c/"));

    }
}
