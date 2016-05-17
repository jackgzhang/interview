package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class WildCardMatchTest {

    private Q123_WildCardMatch source = new Q123_WildCardMatch();

    @Test
    public void test() {
        Assert.assertSame(true, source.isMatch("a", "a"));
        Assert.assertSame(true, source.isMatch("ab", "ab"));
        Assert.assertSame(false, source.isMatch("ab", "abc"));
        Assert.assertSame(true, source.isMatch("abc", "ab?"));
        Assert.assertSame(true, source.isMatch("abc", "ab*"));
        Assert.assertSame(true, source.isMatch("abcdef", "ab*ef"));
        Assert.assertSame(true, source.isMatch("abcdef", "ab*e*f"));
        Assert.assertSame(false, source.isMatch("abcdef1", "ab*e*f"));
        Assert.assertSame(false, source.isMatch("aa", "a"));
        Assert.assertSame(true, source.isMatch("aa", "aa"));
        Assert.assertSame(false, source.isMatch("aaa", "aa"));
        Assert.assertSame(true, source.isMatch("aa", "*"));
        Assert.assertSame(true, source.isMatch("aa", "a*"));
        Assert.assertSame(true, source.isMatch("ab", "?*"));
        Assert.assertSame(false, source.isMatch("aab", "c*a*b"));
        Assert.assertSame(false, source.isMatch("b", "*?*?"));
        Assert.assertSame(true, source.isMatch("baabbaabbaabbbbabbbbbbabbbbaababbabaabaababbbabbbaaabb", "**aba*aa*"));
        Assert.assertSame(false, source.isMatch("aa", "a"));
        Assert.assertSame(true, source.isMatch("aa", "aa"));
        Assert.assertSame(false, source.isMatch("aaa", "aa"));
        Assert.assertSame(true, source.isMatch("aa", "*"));
        Assert.assertSame(true, source.isMatch("aa", "a*"));
        Assert.assertSame(true, source.isMatch("ab", "?*"));// true
        Assert.assertSame(false, source.isMatch("aab", "c*a*b")); // false
        Assert.assertSame(true, source.isMatch("a", "a"));// true
        Assert.assertSame(false, source.isMatch("a", "aa")); // false
        Assert.assertSame(false, source.isMatch("aa", "aaa")); // false
        Assert.assertSame(true, source.isMatch("", ""));// true
        Assert.assertSame(true, source.isMatch("", "*"));// true
        Assert.assertSame(false, source.isMatch("", "a")); // false
        Assert.assertSame(false, source.isMatch("", "?")); // false
        Assert.assertSame(false, source.isMatch("a", "")); // false
        Assert.assertSame(true, source.isMatch("a", "a*"));// true
        Assert.assertSame(true, source.isMatch("a", "?*"));// true
        Assert.assertSame(true, source.isMatch("a", "*"));// true
        Assert.assertSame(true, source.isMatch("b", "?"));// true
        Assert.assertSame(false, source.isMatch("b", "??")); // false
        Assert.assertSame(true, source.isMatch("bc", "??"));// true
        Assert.assertSame(false, source.isMatch("bcd", "??")); // false
        Assert.assertSame(false, source.isMatch("b", "?*?")); // false
        Assert.assertSame(false, source.isMatch("b", "*?*?")); // false
        Assert.assertSame(false, source.isMatch("b", "*?*?*")); // false
        Assert.assertSame(true, source.isMatch("c", "*?*"));// true

        Assert.assertSame(false, source.isMatch("cd", "?")); // false

        Assert.assertSame(true, source.isMatch("de", "??"));// true

        Assert.assertSame(false, source.isMatch("fg", "???")); // false

        Assert.assertSame(true, source.isMatch("hi", "*?"));// true

        Assert.assertSame(false, source.isMatch("ab", "*a")); // false

        Assert.assertSame(true, source.isMatch("aa", "*a"));// true

        Assert.assertSame(true, source.isMatch("cab", "*ab"));// true

        Assert.assertSame(true, source.isMatch("ab", "*ab"));// true

        Assert.assertSame(false, source.isMatch("ac", "*ab")); // false

        Assert.assertSame(false, source.isMatch("abc", "*ab")); // false

        Assert.assertSame(true, source.isMatch("cabab", "*ab"));// true

        Assert.assertSame(true, source.isMatch("ab", "ab"));// true

        Assert.assertSame(true, source.isMatch("ab", "*?*?*"));// true

        Assert.assertSame(false, source.isMatch("ac", "ab")); // false

        Assert.assertSame(false, source.isMatch("a", "ab")); // false

        Assert.assertSame(false, source.isMatch("abc", "ab")); // false

        Assert.assertSame(false, source.isMatch("", "ab*")); // false

        Assert.assertSame(false, source.isMatch("a", "ab*")); // false

        Assert.assertSame(true, source.isMatch("ab", "ab*"));// true

        Assert.assertSame(false, source.isMatch("ac", "ab*")); // false

        Assert.assertSame(true, source.isMatch("abc", "ab*"));// true

        Assert.assertSame(false, source.isMatch("", "*a*")); // false

        Assert.assertSame(true, source.isMatch("a", "*a*"));// true

        Assert.assertSame(false, source.isMatch("b", "*a*")); // false

        Assert.assertSame(true, source.isMatch("ba", "*a*"));// true

        Assert.assertSame(true, source.isMatch("ab", "*a*"));// true

        Assert.assertSame(true, source.isMatch("bac", "*a*"));// true

        Assert.assertSame(true, source.isMatch("hello", "*o*"));// true

        Assert.assertSame(true, source.isMatch("ho", "**ho"));// true

        Assert.assertSame(true, source.isMatch("ho", "ho**"));// true

        Assert.assertSame(false, source.isMatch("abc", "abd")); // false

        Assert.assertSame(true, source.isMatch("abc", "abc*"));// true

        Assert.assertSame(true, source.isMatch("abcd", "abc*d"));// true

        Assert.assertSame(false, source.isMatch("abce", "abc*d")); // false

        Assert.assertSame(true, source.isMatch("abced", "abc*d"));// true

        Assert.assertSame(true, source.isMatch("abcdd", "abc*d"));// true

        Assert.assertSame(false, source.isMatch("abcede", "abc*d")); // false

        Assert.assertSame(true, source.isMatch("abcedd", "abc*d"));// true

        Assert.assertSame(true, source.isMatch("abc?d", "abc*d"));// true

        Assert.assertSame(true, source.isMatch("abce", "abc*?"));// true

        Assert.assertSame(false, source.isMatch("abce", "abc*??")); // false

        Assert.assertSame(true, source.isMatch("abcde", "abc*?"));// true

        Assert.assertSame(false, source.isMatch("abc", "*?*?*?*?")); // false

        Assert.assertSame(true, source.isMatch("abcd", "*?*?*?*?"));// true

        Assert.assertSame(true, source.isMatch("abcde", "*?*?*?*?"));// true

        Assert.assertSame(false, source.isMatch("abcdefde", "abc*def")); // false
        Assert.assertSame(true, source.isMatch("abcdefdef", "abc*def"));// true
        Assert.assertSame(false, source.isMatch("abcdefdefg", "abc*def")); // false
        Assert.assertSame(false, source.isMatch("abc", "abc*defghijk")); // false
        Assert.assertSame(false, source.isMatch("abcdefghij", "abc*defghijk")); // false
        Assert.assertSame(true, source.isMatch("abcdefghijk", "abc*defghijk"));// true
        Assert.assertSame(false, source.isMatch("d", "*d*d")); // false
        Assert.assertSame(false, source.isMatch("abcdefghijkl", "abc*defghijk")); // false
        Assert.assertSame(false, source.isMatch("hellohellc", "h*llo")); // false
        Assert.assertSame(true, source.isMatch("aac", "*ac"));// true
        Assert.assertSame(true, source.isMatch("aba", "a*a"));// true
        Assert.assertSame(true, source.isMatch("aabcdedefghijkl", "aabc*"));// true
        Assert.assertSame(true, source.isMatch("abcdef", "a?*cde*"));// true
        Assert.assertSame(false, source.isMatch("abcdef", "a?de*")); // false
        Assert.assertSame(false, source.isMatch("abcdef", "bd*a?**")); // false
        Assert.assertSame(true, source.isMatch("mississippi", "m*si*"));// true

    }
}
