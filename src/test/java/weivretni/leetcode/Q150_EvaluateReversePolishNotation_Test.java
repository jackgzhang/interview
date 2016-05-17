package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q150_EvaluateReversePolishNotation_Test {

    private Q150_EvaluateReversePolishNotation source = new Q150_EvaluateReversePolishNotation();

    @Test
    public void test() {

        Assert.assertEquals(6, source.evalRPN(new String[] { "4", "13", "5", "/", "+" }));
        Assert.assertEquals(0, source.evalRPN(new String[] { "0", "3", "/" }));
        Assert.assertEquals(9, source.evalRPN(new String[] { "2", "1", "+", "3", "*" }));
        Assert.assertEquals(5, source.evalRPN(new String[] { "2", "3", "+" }));
    }
}
