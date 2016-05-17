package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q121_BestTimeToBuySellStock_Test {

    private Q121_BestTimeToBuySellStock source = new Q121_BestTimeToBuySellStock();

    @Test
    public void test() {
        Assert.assertEquals(5,source.maxProfit(new int[]{5,4,9,4,1,3}));
    }
}
