package weivretni.mixpanel;

import java.util.Hashtable;

import junit.framework.Assert;

import org.junit.Test;

public class NumberPalindromeTest {

    private NumberPalindrome source = new NumberPalindrome();

    @Test
    public void test() {
        Assert.assertTrue(source.isPalindrome(121));
        Assert.assertTrue(source.isPalindrome(121121));
        Assert.assertTrue(source.isPalindrome(123454321));
        Assert.assertTrue(source.isPalindrome(1210121));
        
        
        Assert.assertFalse(source.isPalindrome(1212));
        
        Hashtable ht = new Hashtable();
        ht.put("1", "f");
        
        System.out.println(ht.get("1"));
    }
}
