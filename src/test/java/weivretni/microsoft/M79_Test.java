package weivretni.microsoft;

import org.junit.Test;

import weivretni.BaseTest;

public class M79_Test extends BaseTest {

    private MS79 source = new MS79();

    @Test
    public void test() {
        System.out.println(nicePrintListNode(source.sort(getListNode2())));
        
    }
}
