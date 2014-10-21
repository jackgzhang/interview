package weivretni.offer;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class Question_41_Test {

    private Question_41 source = new Question_41();

    @Test
    public void test() {
        Assert.assertEquals("4,11", source.doIt(new int[] { 1, 2, 4, 7, 11, 15 }, 15));

        List<String> result = source.doIt2(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 15);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
