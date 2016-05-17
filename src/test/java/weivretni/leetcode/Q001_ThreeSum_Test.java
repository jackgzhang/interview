package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q001_ThreeSum_Test extends BaseTest {

    private Q001_ThreeSum source = new Q001_ThreeSum();

    @Test
    public void test() {
        assertEquals(source.threeSum_2(new int[]{-4, -2, -1, 0, 1, 2, 3, 4}), source.threeSum_1(new int[]{-4, -2, -1, 0, 1, 2, 3, 4}));
        assertEquals(source.threeSum_2(new int[]{-15, -13, -4, -2, -1, 0, 1, 2, 3, 4, 13, 15}), source.threeSum_1(new int[]{-15, -13, -4, -2, -1, 0, 1, 2, 3, 4, 13, 15}));
        assertEquals(source.threeSum_2(new int[]{-2, -1, 0, 1, 2}), source.threeSum_1(new int[]{-2, -1, 0, 1, 2}));
        assertEquals(source.threeSum_2(new int[]{-2, 0, 1, 3}), source.threeSum_1(new int[]{-2, 0, 1, 3}));
        assertEquals(source.threeSum_2(new int[]{-2, -1, 1, 2}), source.threeSum_1(new int[]{-2, -1, 1, 2}));
        assertEquals(source.threeSum_2(new int[]{-15, -13, -4, -2, -1, 0, 1, 2, 3, 4, 13, 15}), source.threeSum_1(new int[]{-15, -13, -4, -2, -1, 0, 1, 2, 3, 4, 13, 15}));
    }
}
