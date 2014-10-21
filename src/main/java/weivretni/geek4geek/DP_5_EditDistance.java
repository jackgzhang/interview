package weivretni.geek4geek;

/**
 * 
 * http://www.geeksforgeeks.org/dynamic-programming-set-5-edit-distance/
 * 
 * Resolution came from: http://www.csse.monash.edu.au/~lloyd/tildeAlgDS/Dynamic/Edit/
 * 
 * 
 * <pre>
 * The edit distance of two strings, s1 and s2, is defined as the minimum number of point mutations required to change s1 into s2, where a point mutation is one of:
 * 
 * change a letter,
 * insert a letter or
 * delete a letter.
 * 
 * 
 * The following recurrence relations define the edit distance, d(s1,s2), of two strings s1 and s2:
 * 
 * d('', '') = 0               -- '' = empty string
 * d(s, '')  = d('', s) = |s|  -- i.e. length of s
 * d(s1+ch1, s2+ch2)
 *   = min( d(s1, s2) + if ch1=ch2 then 0 else 1 fi,
 *          d(s1+ch1, s2) + 1,
 *          d(s1, s2+ch2) + 1 )
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class DP_5_EditDistance {

    private boolean isEmpatyOrNull(String s1) {
        if (s1 == null || s1.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int doIt(String s1, String s2) {
        if (isEmpatyOrNull(s1) && isEmpatyOrNull(s2)) {
            return 0;
        } else if (isEmpatyOrNull(s1)) {
            return s2.length();
        } else if (isEmpatyOrNull(s2)) {
            return s1.length();
        } else {

            int equals = 0;
            if (s1.charAt(0) != s2.charAt(0)) {
                equals = 1;
            }

            int d1 = doIt(s1.substring(1), s2.substring(1)) + equals;
            int d2 = doIt(s1.substring(1), s2) + 1;
            int d3 = doIt(s2.substring(1), s1) + 1;
            return Math.min(d1, Math.min(d2, d3));
        }
    }
}
