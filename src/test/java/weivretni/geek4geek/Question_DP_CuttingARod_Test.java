package weivretni.geek4geek;

import junit.framework.Assert;

import org.junit.Test;

/**
 * 
 * @author gzhang
 * 
 */
public class Question_DP_CuttingARod_Test {

    private DP_13_CuttingARod source = new DP_13_CuttingARod();

    @Test
    public void test() {
        Assert.assertEquals(22, source.doIt(new int[] { 1, 5, 8, 9, 10, 17, 17, 20 }, 8));
    }
}
