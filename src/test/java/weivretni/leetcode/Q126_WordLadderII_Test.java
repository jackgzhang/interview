package weivretni.leetcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Q126_WordLadderII_Test {

    @Test
    public void test() {
        Q126_WordLadderII source = new Q126_WordLadderII();

        System.out.println(source.findLadders("ab", "cd", genStringSet(new String[] { "az", "cz" })));

        // System.out.println(source.findLadders("hit", "cog", genStringSet(new String[] { "hot",
        // "dot", "dog", "lot", "log" })));

    }

    private Set<String> genStringSet(String[] values) {
        Set<String> dict = new HashSet<String>();
        for (String value : values) {
            dict.add(value);
        }

        return dict;
    }
}
