package weivretni.offer;

import org.junit.Assert;
import org.junit.Test;

public class Question_42_Test {

    private Question_42 source = new Question_42();

    @Test
    public void test() {
        Assert.assertArrayEquals(new char[] { 'w', 'o', ' ', 'h', 'e', 'l', 'l' }, source.doIt(new char[] { 'h', 'e', 'l', 'l', ' ', 'w', 'o' }));
        Assert.assertArrayEquals(new char[] { 'y', 'u', ' ', 'w', 'o', ' ', 'h', 'e', 'l', 'l' }, source.doIt(new char[] { 'h', 'e', 'l', 'l', ' ', 'w', 'o', ' ', 'y', 'u' }));
    }
}
