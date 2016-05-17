package weivretni.leetcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Q140_WordBreak2_Test {

    @Test
    public void test() {
        Q140_WordBreak2 source = new Q140_WordBreak2();

        System.out.println(source.wordBreak("abc", genStringSet(new String[] { "a", "b", "c", "bc", "ab" })));

    }

    private Set<String> genStringSet(String[] values) {
        Set<String> dict = new HashSet<String>();
        for (String value : values) {
            dict.add(value);
        }

        return dict;
    }
}
