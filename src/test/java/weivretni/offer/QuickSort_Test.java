package weivretni.offer;

import junit.framework.Assert;

import org.junit.Test;

import weivretni.common.QuickSort;

public class QuickSort_Test {

    QuickSort source = new QuickSort();

    @Test
    public void test() {
//        Assert.assertEquals("1,2,3,7,8,9,", source.doIt(new int[] { 7, 8, 9, 1, 2, 3 }));
//        Assert.assertEquals("1,2,3,4,5,6,7,8,9,", source.doIt(new int[] { 7, 8, 5, 6, 9, 1, 2, 3, 4 }));
        Assert.assertEquals("1,2,3,4,5,", source.doIt(new int[] { 5, 4, 3, 2, 1 }));
    }
}
