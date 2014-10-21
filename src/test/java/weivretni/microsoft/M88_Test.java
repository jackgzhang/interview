package weivretni.microsoft;

import org.junit.Test;

public class M88_Test {

    private MS88 source = new MS88();

    @Test
    public void test() {

        char[] input = "ab*8cd**".toCharArray();

        source.count(input);

        System.out.println(input);

    }
}
