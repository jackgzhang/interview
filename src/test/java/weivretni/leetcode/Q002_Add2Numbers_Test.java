package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.ListNode;

public class Q002_Add2Numbers_Test extends BaseTest {

    private Q002_Add2Numbers source = new Q002_Add2Numbers();

    @Test
    public void test() {
        ListNode result = source.addTwoNumbers(this.getListNode1(), this.getListNode3());
        System.out.println(result.toString());
        // Assert.assertEquals("10101", source.addBinary("1010", "1011"));
        // Assert.assertEquals("100", source.addBinary("11", "1"));
        // Assert.assertEquals("1", source.addBinary("1", "0"));
        // Assert.assertEquals("0", source.addBinary("0", "0"));
        // Assert.assertEquals("10", source.addBinary("1", "1"));
        // Assert.assertEquals("11", source.addBinary("10", "1"));
        // Assert.assertEquals("1001", source.addBinary("1000", "1"));

    }
}
