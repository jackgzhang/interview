package weivretni.microsoft;

import org.junit.Test;

public class MS14_Test {

    MS14 source = new MS14();

    @Test
    public void test() {
        source.findit(new int[] { 2, 4, 5, 6, 7, 8, 9, 11, 12 }, 19);
    }
}
