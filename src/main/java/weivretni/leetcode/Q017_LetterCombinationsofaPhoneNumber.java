package weivretni.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * Given a digit string, return all possible letter combinations that the number could represent.
 * 
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * 
 * 1:""
 * 2:abc
 * 3:def
 * 4:ghi
 * 5:jkl
 * 6:mno
 * 7:pqrs
 * 8:tuv
 * 9:wxyz
 * 0:""
 * 
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 * </pre>
 * 
 */
public class Q017_LetterCombinationsofaPhoneNumber {

    private String[] map = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return Arrays.asList(new String[] { "" });
        } else {
            List<String> currResult = letterCombinations(digits.substring(1));
            List<String> result = new ArrayList<String>();
            String currPrefix = map[digits.charAt(0) - '0'];
            for (String str : currResult) {
                for (char c : currPrefix.toCharArray()) {
                    result.add(c + str);
                }
            }
            return result;
        }
    }
}
