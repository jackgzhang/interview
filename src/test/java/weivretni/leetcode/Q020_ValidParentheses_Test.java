package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;


public class Q020_ValidParentheses_Test {
    @Test
    public void test() {
        Q020_ValidParentheses source = new Q020_ValidParentheses();
        Assert.assertEquals(true, source.isValid("(){}[]"));
        Assert.assertEquals(true, source.isValid("()"));
        
        Assert.assertEquals(false, source.isValid("(()"));
        Assert.assertEquals(false, source.isValid("{{}}}"));
    }
}
