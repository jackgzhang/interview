package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q003_LongestSubstringWithoutRepeatingCharacters_Test {

    private Q003_LongestSubstringWithoutRepeatingCharacters source = new Q003_LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void test() {
        Assert.assertEquals(1, source.lengthOfLongestSubstring("aa"));


        Assert.assertEquals(3, source.lengthOfLongestSubstring("abcb"));
        
        Assert
            .assertEquals(
                12,
                source
                    .lengthOfLongestSubstring("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"));
        Assert.assertEquals(1, source.lengthOfLongestSubstring("aa"));
        Assert.assertEquals(1, source.lengthOfLongestSubstring("a"));
        Assert.assertEquals(3, source.lengthOfLongestSubstring("abc"));
    }
}
