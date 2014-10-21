package weivretni.common;

import org.junit.Test;

import weivretni.BaseTest;

public class HeapSort_Test extends BaseTest {

    HeapSort source = new HeapSort();

    @Test
    public void test() {
        assertEquals(new int[] { 7, 8, 9, 10 }, source.doIt(new int[] { 10, 9, 8, 7, }));
        assertEquals(new int[] { 1, 2, 3, 4, 7, 8, 9, 10 }, source.doIt(new int[] { 10, 9, 8, 7, 4, 3, 1, 2 })); // 2+3
    }
}
