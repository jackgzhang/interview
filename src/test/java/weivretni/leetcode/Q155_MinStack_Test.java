package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q155_MinStack_Test {

    @Test
    public void test() {
        Q155_MinStack source = new Q155_MinStack();

        source.push(-2);
        source.push(0);
        source.push(-1);
        Assert.assertEquals(-2, source.getMin());
        Assert.assertEquals(-1, source.top());
        source.pop();
        Assert.assertEquals(-2, source.getMin());
    }
}
