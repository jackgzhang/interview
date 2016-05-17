package weivretni.leetcode;

/**
 * <pre>
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * </pre>
 * 
 * 
 * http://blog.csdn.net/v_july_v/article/details/7041827
 * 
 * 从头到尾彻底理解KMP
 *
 * No need to use KMP.  Brutal force is just fine
 * 
 * @author gzhang
 * 
 */
public class Q028_Str {

    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}
