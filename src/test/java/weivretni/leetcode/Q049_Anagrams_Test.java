package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

public class Q049_Anagrams_Test extends BaseTest {

    private Q049_Anagrams source = new Q049_Anagrams();

    @Test
    public void test() {
        System.out.println(source.anagrams(new String[] { "abc", "cba", "ee" }));
    }
}
