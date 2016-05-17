package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q009_PalindromeNumber_Test {

    @Test
    public void test() {
        Q009_PalindromeNumber source = new Q009_PalindromeNumber();
        //Assert.assertSame(true, source.isPalindrome(121));
        Assert.assertSame(true, source.isPalindrome(1221));
        Assert.assertSame(false, source.isPalindrome(12211));
    }
}
