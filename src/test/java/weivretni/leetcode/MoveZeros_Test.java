package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class MoveZeros_Test extends BaseTest {
    private MoveZeros source = new MoveZeros();

    @Test
    public void test() {
        assertEquals(new int[]{1,2,0}, source.moveZeroes(new int[]{1,0,2}));
        assertEquals(new int[]{1,2,3,5,0,0,0}, source.moveZeroes(new int[]{1,0,2,0,3,0,5}));

    }
}
