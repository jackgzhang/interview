package weivretni.offer;

import junit.framework.Assert;

import org.junit.Test;

public class Question_21_Test {

    private Question_21 stack = new Question_21();

    @Test
    public void test() {
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(0);
        
        Assert.assertEquals(0, stack.min());
        Assert.assertEquals(0, stack.pop());
        Assert.assertEquals(1, stack.min());
        Assert.assertEquals(-1, stack.push(-1));
        Assert.assertEquals(-1, stack.min());
        Assert.assertEquals(-1, stack.pop());
        Assert.assertEquals(4, stack.pop());
        Assert.assertEquals(3, stack.pop());
        Assert.assertEquals(1, stack.min());
        Assert.assertEquals(1, stack.pop());
        Assert.assertEquals(2, stack.min());
    }
}
