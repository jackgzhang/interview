package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Q127_WordLadder_Test {

    @Test
    public void test() {
        Q127_WordLadder source = new Q127_WordLadder();
        Assert.assertEquals(1, source.ladderLength("a", "c", genStringSet(new String[] {  "b" })));
        Assert.assertEquals(4, source.ladderLength("hit", "cog", genStringSet(new String[] { "hot","dot","dog","lot","log" })));
    }

    private Set<String> genStringSet(String[] values) {
        Set<String> dict = new HashSet<>();
        for (String value : values) {
            dict.add(value);
        }

        return dict;
    }
}
