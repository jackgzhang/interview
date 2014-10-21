package weivretni.offer;

import java.util.Set;

import org.junit.Test;

public class Question_28_Test {

    private Question_28 source = new Question_28();

    @Test
    public void test() {
        Set<String> result = source.doIt("abc");
        for (String str : result) {
            System.out.println(str);
        }

    }
}
