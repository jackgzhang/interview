package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Q139_WordBreak_Test {

    @Test
    public void test() {
        Q139_WordBreak source = new Q139_WordBreak();

        Assert.assertEquals(true, source.wordBreak("abc", genStringSet(new String[] { "a", "bc" })));
        Assert.assertEquals(false, source.wordBreak("a", genStringSet(new String[] {})));
        Assert.assertEquals(false, source.wordBreak("aaaaaaa", genStringSet(new String[] { "aaaa", "aa" })));

    }

    private Set<String> genStringSet(String[] values) {
        Set<String> dict = new HashSet<String>();
        for (String value : values) {
            dict.add(value);
        }

        return dict;
    }
}
