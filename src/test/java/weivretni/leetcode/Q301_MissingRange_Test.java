package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

/**
 * Created by gzhang on 3/16/16.
 */
public class Q301_MissingRange_Test extends BaseTest {
    @Test
    public void test() {
        Q301_MissingRange source = new Q301_MissingRange();
        assertEquals(new String[]{"0->99"}, toList(source.findMissingRanges(new int[]{}, 0, 99)));
        assertEquals(new String[]{"0->2","4->99"}, toList(source.findMissingRanges(new int[]{3}, 0, 99)));
        assertEquals(new String[]{"2","4->49","51->74","76->99"}, toList(source.findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99)));

    }
}
