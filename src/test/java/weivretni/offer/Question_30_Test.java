package weivretni.offer;

import org.junit.Test;

public class Question_30_Test {

    private Question_30 source = new Question_30();

    @Test
    public void test() {
        int[] result = source.doIt(new int[] { 3, 200, 400, 1, 2, 4, 900, 12, 142, 34, 23, 5, 111, 112, 113, 114, 115, 116, 117 }, 5);
        for (int number : result) {
            System.out.println(number);
        }
    }
}
