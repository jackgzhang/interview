package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class RotateArray_Test extends BaseTest {

    private RotateArray source = new RotateArray();

    @Test
    public void test() {
        this.assertEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, source.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
        this.assertEquals(new int[]{3,1,2}, source.rotate(new int[]{1, 2, 3}, 1));
    }
}