package weivretni.microsoft;

import org.junit.Test;

import weivretni.BaseTest;
import weivretni.Utils;

public class MS32_Test extends BaseTest {

    private MS32 source = new MS32();

    @Test
    public void test() {

        int[] a = new int[] { 100, 99, 98, 1, 2, 3 };
        int[] b = new int[] { 1, 2, 3, 4, 5, 40 };
        source.findIt(a, b);

        System.out.println(Utils.nicePrintArray(a));
        System.out.println(Utils.nicePrintArray(b));
    }
}
