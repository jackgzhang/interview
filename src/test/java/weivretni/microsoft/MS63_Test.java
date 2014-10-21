package weivretni.microsoft;

import org.junit.Test;

public class MS63_Test {

    private MS63 source = new MS63();

    @Test
    public void test() {
        System.out.println(source.replace(new char[] { '1', 'a', 'b', '2', 'a', '4' }, new char[] { 'a', 'b' }));
        System.out.println(source.replace(new char[] { 'a', 'a', 'b', '2', 'a', '4' }, new char[] { 'a', 'b' }));
    }
}
