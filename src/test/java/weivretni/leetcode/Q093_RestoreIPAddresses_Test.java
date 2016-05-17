package weivretni.leetcode;

import org.junit.Test;

public class Q093_RestoreIPAddresses_Test {

    @Test
    public void test() {
        Q093_RestoreIPAddresses source = new Q093_RestoreIPAddresses();

        System.out.println(source.restoreIpAddresses("2222"));
        
        System.out.println(source.restoreIpAddresses("010010"));
        System.out.println(source.restoreIpAddresses("0279245587303"));
        
        System.out.println(source.restoreIpAddresses("25525511135"));
    }
}
