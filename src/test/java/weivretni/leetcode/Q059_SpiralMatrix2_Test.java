package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

import java.util.Arrays;

public class Q059_SpiralMatrix2_Test extends BaseTest {

    @Test
    public void test() {
        Q059_SpiralMatrix2 source = new Q059_SpiralMatrix2();

        System.out.println(Arrays.deepToString(source.generateMatrix(2)));
        System.out.println(Arrays.deepToString(source.generateMatrix(3)));

    }
}
