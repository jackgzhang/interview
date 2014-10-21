package weivretni.offer;

import org.junit.Test;

import weivretni.BaseTest;

public class Question_33_Test extends BaseTest {

    private Question_33 source = new Question_33();

    @Test
    public void test() {
        assertEquals(new int[] { 1, 2, 3 }, source.doIt(new int[] { 3, 1, 2 }));
        assertEquals(new int[] { 1, 2, 3 }, source.doIt(new int[] { 1, 3, 2 }));
        assertEquals(new int[] { 11, 21, 34 }, source.doIt(new int[] { 34, 11, 21 }));
    }
}
