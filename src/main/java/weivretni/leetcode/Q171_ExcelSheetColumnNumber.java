package weivretni.leetcode;

/**
 * <pre>
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * 
 * For example:
 * 
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q171_ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        } else {
            int total = 0;
            int currPosition = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                int num = c - 'A' + 1;

                total += num * Math.pow(26, currPosition++);
            }
            
            return total;
        }
    }

}
