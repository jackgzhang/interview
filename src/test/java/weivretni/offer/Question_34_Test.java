package weivretni.offer;

import java.util.List;

import org.junit.Test;

public class Question_34_Test {

    private Question_34 source = new Question_34();

    @Test
    public void test() {
        List<Integer> numbers = source.doIt(100);

        for (Integer i : numbers) {
            System.out.println(i);
        }
    }
}
