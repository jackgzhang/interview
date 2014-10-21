package weivretni.leetcode;

import junit.framework.Assert;

import org.junit.Test;

public class LongestValidParentheses_Test {

    private Q046_LongestValidParentheses source = new Q046_LongestValidParentheses();

    @Test
    public void test() {
        // Assert.assertEquals(2, source.longestValidParentheses("()"));
        // Assert.assertEquals(2, source.longestValidParentheses("(()"));
        // Assert.assertEquals(4, source.longestValidParentheses("(())"));
        // Assert.assertEquals(0, source.longestValidParentheses(""));
        // Assert.assertEquals(0, source.longestValidParentheses("("));
        // Assert.assertEquals(0, source.longestValidParentheses(")"));
        // Assert.assertEquals(0, source.longestValidParentheses(")("));
        // Assert.assertEquals(2, source.longestValidParentheses("(()"));
         Assert.assertEquals(4, source.longestValidParentheses("()()"));
        // Assert.assertEquals(6, source.longestValidParentheses("()(())"));
        // Assert.assertEquals(6, source.longestValidParentheses("(()())"));
        // Assert.assertEquals(4, source.longestValidParentheses(")()())()()("));
        // Assert.assertEquals(6, source.longestValidParentheses("(()())"));
    }
}
