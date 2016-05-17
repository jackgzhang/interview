package weivretni.leetcode;

import java.util.Arrays;

/**
 * <pre>
 * Given a string, find the length of the longest substring without repeating characters. 
 * 
 * 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
 * 
 * 
 * which the length is 3. 
 * For "bbbbb" the longest substring is "b", with the length of 1.
 * </pre>
 * 
 * <pre>
 * DP 解法 超时 O(n^3)
 * http://fisherlei.blogspot.com/2012/12/leetcode-longest-substring-without.html
 * 
 * 
 * 2个指针从左往右扫描，当遇到重复字母时，以上一个重复字母的index +1  ，作为新的搜索起始位置。比如
 * 
 *   index：      0 1 2 3 4 5 6 7 8 9  10 11 
 *                q p x r j x k l t z  y  x
 *            
 *   1st Round:   |<------->|   
 *   2nd round:         |<--------------->|
 *   3nd round:               |<--------->|  
 * 
 * 直到扫描到最后一个字母。
 * 
 * 注意用 int Array 当 hash
 * 
 * 
 * 解法二，  一个 iteration 即可
 * 
 * In fact, it could be optimized to require only n steps. 
 * Instead of using a table to tell if a character exists or not, 
 * we could define a mapping of the characters to its last index. 
 * Then we can skip the characters immediately when we found a repeated character.
 * 
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q003_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        } else {
            int i = 0;
            int maxLength = 0;

            int[] position = new int[256];
            Arrays.fill(position, -1);
            for (int index = 0; index < s.length(); index++) {

                if (position[s.charAt(index)] >= i) {
                    i = position[s.charAt(index)] + 1;
                }

                position[s.charAt(index)] = index;

                maxLength = Math.max(maxLength, index - i + 1);
            }

            return maxLength;
        }
    }
}
