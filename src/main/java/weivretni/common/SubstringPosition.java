package weivretni.common;

import java.util.Random;

/**
 * 求一个短string在另一个长string里的index ， KMP经典算法.
 * 
 * Use rolling hash
 * 
 * 
 * http://www.360doc.com/content/11/1208/12/3705007_170615975.shtml
 * 
 * @author gzhang
 * 
 */
public class SubstringPosition {

    private boolean equals(String s1, String s2, int s1index) {
        int s2index = 0;

        while (s2index < s2.length() && s1.charAt(s1index) == s2.charAt(s2index)) {
            s1index++;
            s2index++;
        }

        return (s2index == s2.length());
    }

    /**
     * Brutal Force
     * 
     * @return
     */
    public int getPositionBrutalFroace(String s1, String s2) {
        int index1 = 0;

        while (index1 <= s1.length() - s2.length()) {

            if (equals(s1, s2, index1)) {
                return index1;
            }

            index1++;

        }
        return -1;

    }

    /************************************************************
     * 
     ***********************************************************/

    private static int PRIME_BASE = 10;

    private int pow(int e, int x) {
        int result = 1;

        if (x == 0) {
            return result;
        }

        for (int i = 0; i < x; i++) {
            result = result * e;
        }

        return result;
    }

    private int rollingHash(String string) {

        int result = 0;

        int expoential = string.length();

        for (int i = 0; i < string.length(); i++) {
            
            int pow = pow(PRIME_BASE, expoential - i - 1);
            int charValue = ((int) string.charAt(i));
            
            result = result + pow * charValue;
        }

        return result;
    }

    /**
     * http://en.wikipedia.org/wiki/Rabin-Karp_string_search_algorithm
     * 
     * <pre>
     * function RabinKarp(string s[1..n], string sub[1..m])
     * hsub := hash(sub[1..m]);  hs := hash(s[1..m])
     * for i from 1 to n-m+1
     *   if hs = hsub
     *     if s[i..i+m-1] = sub
     *       return i
     *   hs := hash(s[i+1..i+m])
     * return not found
     * </pre>
     * 
     * 
     * @param s1
     * @param s2
     * @return
     */
    public int getPositionRollingHash(String s1, String s2) {

        int index1 = 0;

        int hash2 = rollingHash(s2);

        int hash1 = 0;
        while (index1 <= s1.length() - s2.length()) {

            if (hash1 == 0) {
                hash1 = rollingHash(s1.substring(index1, index1 + s2.length()));
            } else {
                hash1 = hash1 - (int) s1.charAt(index1 - 1) * (pow(PRIME_BASE, s2.length() - 1));
                hash1 = hash1 * PRIME_BASE;
                hash1 = hash1 + (int) s1.charAt(-1 + index1 + s2.length());
            }

            if (hash1 == hash2) {

                if (equals(s1, s2, index1)) {
                    return index1;
                }
            }

            index1++;

        }
        return -1;
    }
}
