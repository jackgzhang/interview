package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q032_LongestValidParentheses_Test {

    private Q032_LongestValidParentheses source = new Q032_LongestValidParentheses();

    @Test
    public void test() {
        Assert.assertEquals(0, source.longestValidParentheses(")"));
        Assert.assertEquals(6, source.longestValidParentheses("(()())"));
        Assert.assertEquals(6, source.longestValidParentheses("(()())"));
        Assert.assertEquals(4, source.longestValidParentheses("()()"));
        
    }
}
