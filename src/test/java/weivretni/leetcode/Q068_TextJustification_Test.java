package weivretni.leetcode;

import org.junit.Test;

public class Q068_TextJustification_Test {

    private Q068_TextJustification source = new Q068_TextJustification();

    @Test
    public void test() {
        System.out.println(source.fullJustify(new String[] { "" }, 2));
        System.out.println(source.fullJustify(new String[] { "a", "b", "c", "d", "e" }, 1));
        System.out.println(source.fullJustify(new String[] { "This", "is", "an", "example", "of", "text", "justification." }, 16));
    }
}
