package weivretni.geek4geek;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class Question_DP_CoinChange_Min_Test {

    private DP_7_CoinChange_Min source = new DP_7_CoinChange_Min();

    @Test
    public void test() {

        List<Integer> changes = new ArrayList<Integer>();
        changes.add(1);
        changes.add(2);
        changes.add(3);

        Assert.assertEquals(2, source.doIt(changes, 5)); // 2+3
        Assert.assertEquals(2, source.doIt(changes, 6)); // 3+ 3

    }
}
