package weivretni.geek4geek;

import junit.framework.Assert;

import org.junit.Test;

public class Question_DP_MinCostPath_Test {

    private DP_6_MinCostPath source = new DP_6_MinCostPath();

    @Test
    public void test() {

        int[][] costMatrix = new int[][] { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };
        Assert.assertEquals(8, source.doIt(costMatrix, 2, 2));

    }
}
