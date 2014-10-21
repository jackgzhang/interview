package weivretni.mixpanel;

import java.util.List;

import org.junit.Test;

import weivretni.BaseTest;
import weivretni.mixpanel.SpiralMatrix;

public class SpiralMatrixTest extends BaseTest {

    private SpiralMatrix source = new SpiralMatrix();

    @Test
    public void test() {
        List<Integer> result = source.printSpiral(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
        assertEquals(new int[] { 1, 2, 3, 6, 9, 8, 7, 4, 5 }, result);
    }
}
