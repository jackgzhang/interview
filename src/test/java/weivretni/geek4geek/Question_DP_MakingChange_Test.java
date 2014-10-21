package weivretni.geek4geek;

import junit.framework.Assert;

import org.junit.Test;

public class Question_DP_MakingChange_Test {

    private Question_DP_MakingChange source = new Question_DP_MakingChange();

    @Test
    public void testMax() {

        Assert.assertEquals(2, source.getMinChanges(1, 2));
        Assert.assertEquals(2, source.getMinChanges(2, 3));
        Assert.assertEquals(1, source.getMinChanges(5, 3));
        Assert.assertEquals(2, source.getMinChanges(5, 9));
        Assert.assertEquals(3, source.getMinChanges(3, 9));
        Assert.assertEquals(4, source.getMinChanges(3, 10));
        Assert.assertEquals(4, source.getMinChanges(3, 11));
        
        
        Assert.assertEquals(2, source.getMinChanges2(1, 2));
        Assert.assertEquals(2, source.getMinChanges2(2, 3));
        Assert.assertEquals(1, source.getMinChanges2(5, 3));
        Assert.assertEquals(2, source.getMinChanges2(5, 9));
        Assert.assertEquals(3, source.getMinChanges2(3, 9));
        Assert.assertEquals(4, source.getMinChanges2(3, 10));
        Assert.assertEquals(4, source.getMinChanges2(3, 11));
    }
}
