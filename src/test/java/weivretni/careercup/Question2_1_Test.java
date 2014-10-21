package weivretni.careercup;

import junit.framework.Assert;

import org.junit.Test;

public class Question2_1_Test {

    private Question2_1 source = new Question2_1();

    @Test
    public void testeQuestion() {
        char[] in = new char[] { 'a', 'b', 'c', '1', '2', '3' };
        char[] out = new char[] { 'a', '1', 'b', '2', 'c', '3' };
        char[] in2 = new char[] { 'a', 'b', 'c', 'd', '1', '2', '3', '4' };
        char[] out2 = new char[] { 'a', '1', 'b', '2', 'c', '3', 'd', '4' };

        Assert.assertEquals(new String(out), new String(source.doIt(in)));
        Assert.assertEquals(new String(out2), new String(source.doIt(in2)));

        in = new char[] { 'a', 'b', 'c', '1', '2', '3' };
        out = new char[] { 'a', '1', 'b', '2', 'c', '3' };
        in2 = new char[] { 'a', 'b', 'c', 'd', '1', '2', '3', '4' };
        out2 = new char[] { 'a', '1', 'b', '2', 'c', '3', 'd', '4' };
        char[] in3 = new char[] { 'a', 'b', 'c', 'd', 'e', '1', '2', '3', '4', '5' };
        char[] out3 = new char[] { 'a', '1', 'b', '2', 'c', '3', 'd', '4', 'e', '5' };
        //Assert.assertEquals(new String(out), new String(source.doIt2(in)));
        Assert.assertEquals(new String(out2), new String(source.doIt2(in2)));
        //Assert.assertEquals(new String(out3), new String(source.doIt2(in3)));
    }
}
