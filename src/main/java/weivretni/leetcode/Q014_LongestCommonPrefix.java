package weivretni.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array
 * 
 * of strings.
 * 
 * @author gzhang
 * 
 */
public class Q014_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        } else {

            String result = "";

            boolean allequals = true;

            for (int i = 0; i < strs[0].length(); i++) {

                if (!allequals) {
                    break;
                }

                char c = strs[0].charAt(i);

                for (int j = 1; j < strs.length; j++) {
                    String str = strs[j];

                    if (str.length() <= i || (str.length() > i && str.charAt(i) != c)) {
                        allequals = false;
                        break;
                    }
                }

                if (allequals) {
                    result += c;
                }

            }

            return result;
        }
    }
}
