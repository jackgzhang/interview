package weivretni.leetcode;

import org.junit.Test;

public class Q030_SubstringwithConcatenationofAllWords_Test {

    private Q030_SubstringwithConcatenationofAllWords source = new Q030_SubstringwithConcatenationofAllWords();

    @Test
    public void test() {
        System.out.println(source.findSubstring("barfoothefoobarman", new String[] { "foo", "bar" }));
        System.out.println(source.findSubstring("abcd", new String[] { "b", "d" }));

        System.out.println(source.findSubstring("abcd", new String[] { "b", "c" }));

    }
}
