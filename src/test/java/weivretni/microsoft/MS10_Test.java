package weivretni.microsoft;

import org.junit.Test;

public class MS10_Test {

    private MS10 source = new MS10();

    @Test
    public void test() {
        System.out.println(source.reverse(new char[] { 'I', ' ', 'A', 'M', ' ', 'A', ' ', 'G', 'I', 'R', 'L' }));
    }
}
