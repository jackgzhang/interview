package weivretni.leetcode;

import org.junit.Test;

public class Q022_GenerateParentheses_Test {

    private Q022_GenerateParentheses source = new Q022_GenerateParentheses();

    @Test
    public void test() {
        System.out.println(source.generateParenthesis(2));
        System.out.println(source.generateParenthesis(3));
        System.out.println(source.generateParenthesis(4));
    }
}
