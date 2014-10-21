package weivretni.microsoft;

import org.junit.Test;

import weivretni.BaseTest;

/**
 * 
 * @author gzhang
 * 
 */
public class MS8_Test extends BaseTest {

    private MS08 source = new MS08();

    @Test
    public void test1() {
        System.out.println(source.q1_Solution1(this.getListNode1()));
        System.out.println(source.q1_Solution2(this.getListNode1()));
    }
}
