package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q034_SearchForARange_Test extends BaseTest {

    private Q034_SearchForARange source = new Q034_SearchForARange();

    @Test
    public void test() {
        this.assertEquals(new int[] { 3, 4 }, source.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8));
        this.assertEquals(new int[] { 0, 0 }, source.searchRange(new int[] { 1 }, 1));
        this.assertEquals(new int[] { -1, -1 }, source.searchRange(new int[] { 2, 2 }, 3));
        this.assertEquals(new int[] { 1, 1 }, source.searchRange(new int[] { 1, 4 }, 4));
        this.assertEquals(new int[] { -1, -1 }, source.searchRange(new int[] { 1 }, 4));
    }
}
