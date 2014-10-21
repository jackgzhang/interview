package weivretni.microsoft;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import weivretni.BaseTest;

public class MS47_Test extends BaseTest {

    private MS47 source = new MS47();

    @Test
    public void test() {
        
        System.out.println(source.find((List<Integer>) Arrays.asList(new Integer[] { 0, 12, 13,1 })));

//        System.out.println(source.find((List<Integer>) Arrays.asList(new Integer[] { 3, 2, 1 })));
//        System.out.println(source.find((List<Integer>) Arrays.asList(new Integer[] { 3, 8, 6, 7, 1, 0 })));
//        System.out.println(source.find((List<Integer>) Arrays.asList(new Integer[] { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 })));
    }
}
