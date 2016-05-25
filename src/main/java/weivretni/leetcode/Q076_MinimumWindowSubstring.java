package weivretni.leetcode;//package weivretni.leetcode;

/**
 * Source:  https://leetcode.com/problems/minimum-window-substring/
 * <p>
 * <pre>
 * Given a string S and a string T, find the minimum window in S which will contain all
 *
 * the characters in T in complexity O(n).
 *
 * For example,
 * S = "ADOBECODEBANC"
 * T = "ABC"
 * Minimum window is "BANC".
 *
 * Note:
 * If there is no such window in S that covers all characters in T,
 * return the empty string "".
 *
 * If there are multiple such windows, you are guaranteed that there
 * will always be only one unique minimum window in S.
 *
 * http://huntfor.iteye.com/blog/2083485
 *
 * 解法:
 *
 * 双指针，动态维护一个区间。尾指针不断往后扫，当扫到有一个窗口包含了所有T的字符后，
 * 然后再收缩头指针，直到不能再收缩为止。最后记录所有可能的情况中窗口最小的
 *
 *
 *
 * </pre>
 */
public class Q076_MinimumWindowSubstring {

    int initTargetHash(int[] targethash, String Target) {
        int targetnum = 0;
        for (char ch : Target.toCharArray()) {
            targetnum++;
            targethash[ch]++;
        }
        return targetnum;
    }

    public String minWindow(String Source, String Target) {
        // queueing the position that matches the char in T
        int ans = Integer.MAX_VALUE;
        String minStr = "";

        int[] targethash = new int[256];

        int targetnum = initTargetHash(targethash, Target);
        int sourcenum = 0;
        int j = 0, i = 0;
        for (i = 0; i < Source.length(); i++) {
            if (targethash[Source.charAt(i)] > 0)
                sourcenum++;

            targethash[Source.charAt(i)]--;
            while (sourcenum >= targetnum) {
                if (ans > i - j + 1) {
                    ans = Math.min(ans, i - j + 1);
                    minStr = Source.substring(j, i + 1);
                }
                targethash[Source.charAt(j)]++;
                if (targethash[Source.charAt(j)] > 0)
                    sourcenum--;
                j++;
            }
        }
        return minStr;
    }
}
