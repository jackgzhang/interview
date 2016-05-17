package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Q120_Triangle_Test {

    private List<List<Integer>> getList(int[][] values) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < values.length; i++) {
            List<Integer> levelResult = new ArrayList<Integer>();

            int[] level = values[i];
            for (int j = 0; j < level.length; j++) {
                levelResult.add(level[j]);
            }

            result.add(levelResult);
        }

        return result;
    }

    @Test
    public void test() {
        Q120_Triangle source = new Q120_Triangle();

        Assert.assertEquals(11, source.minimumTotal(getList(new int[][] { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } })));
        Assert.assertEquals(1, source.minimumTotal(getList(new int[][] { { 1 } })));
        Assert.assertEquals(3, source.minimumTotal(getList(new int[][] { { 1 }, { 2, 3 } })));
        Assert.assertEquals(11, source.minimumTotal(getList(new int[][] { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } })));

    }
}
