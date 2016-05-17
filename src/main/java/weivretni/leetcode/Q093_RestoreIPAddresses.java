package weivretni.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Given a string containing only digits, restore it by returning all 
 * possible valid IP address combinations.
 * 
 * For example:
 * Given "25525511135",
 * 
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q093_RestoreIPAddresses {

    private List<String> result = new ArrayList<String>();

    public List<String> restoreIpAddresses(String s) {
        result = new ArrayList<String>();
        helper(s, 4, "");
        return result;
    }

    private void helper(String s, int n, String currPath) {
        if (s.length() == 0 && n == 0) {
            result.add(currPath.substring(1));
        } else {
            if (s.length() >= 1) {
                helper(s.substring(1, s.length()), n - 1, currPath + "." + s.substring(0, 1));
            }
            if (s.length() >= 2 && isValid(s.substring(0, 2))) {
                helper(s.substring(2, s.length()), n - 1, currPath + "." + s.substring(0, 2));
            }
            if (s.length() >= 3 && isValid(s.substring(0, 3))) {
                helper(s.substring(3, s.length()), n - 1, currPath + "." + s.substring(0, 3));
            }
        }
    }

    private boolean isValid(String s) {
        if (s.startsWith("0") && s.length() > 1) {
            return false;
        }

        return Integer.parseInt(s) >= 1 && Integer.parseInt(s) <= 255;
    }

}
