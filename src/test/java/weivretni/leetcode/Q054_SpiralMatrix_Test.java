package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q054_SpiralMatrix_Test extends BaseTest {

    @Test
    public void test() {
        Q054_SpiralMatrix source = new Q054_SpiralMatrix();

        /**
         * [ [ 1, 2, 3 ], 
         *   [ 4, 5, 6 ], 
         *   [ 7, 8, 9 ] ]
         */
        assertEquals(new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, source.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));


        /**
         * [ [ 1, 2 ], 
         *   [ 3, 4 ], 
         *   ]
         */
        assertEquals(new int[]{1, 2, 4, 3}, source.spiralOrder(new int[][]{{1, 2}, {3, 4}}));
    }
}
