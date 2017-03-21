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
 * （两个指针分别为start，i），以S = “e b a d b a c c b”（忽略空格），T = “abc”为例：
 *
 * 0 1 2 3 4 5 6 7 8
 *
 * 初始化 start = i = 0
 * 1）i 逐渐往后扫描S直到窗口S[start…i]包含所有T的字符，此时i = 6（字符c的位置）
 * 2）缩减窗口：此时我们注意到窗口并不是最小的，需要调整 start 来缩减窗口。
 *    缩减规则为：如果S[start]不在T中 或者 S[start]在T中但是删除后窗口依然可以包含T中的所有字符，那么start = start+1，
 *    直到不满足上述两个缩减规则。缩减后i即为窗口的起始位置，
 *    此例中从e开始窗口中要依次删掉e、b、a、d，start最后等于4 ，那么得到一个窗口大小为6-4+1 = 3
 * 3）start = start+1(此时窗口肯定不会包含所有的T中的字符)，跳转到步骤1继续寻找下一个窗口。
 *    本例中还以找到一个窗口start = 5，i = 8，比上个窗口大，因此最终的最小窗口是S[4…6]
 *
 * 具体实现时，要用哈希表来映射T中字符以便在O(1)时间内判断一个字符是否在T中，由于是字符缘故，可以用数组简单的来实现；

 *
 *
 *
 * </pre>
 */
public class Q076_MinimumWindowSubstring {



//    public String minWindow(String Source, String Target) {
//        int ans = Integer.MAX_VALUE;
//        String minStr = "";
//
//        // Init
//        int[] needToFound = new int[256];
//        int needToMatch = 0;
//        for (char ch : Target.toCharArray()) {
//            needToMatch++;
//            needToFound[ch]++;
//        }
//
//        // Now start
//        int[] foundSoFar = new int [256];
//        int findSoFar = 0 ;
//
//        while (true){
//            while (found(needToMatch, foundSoFar)) {
//
//            }
//        }
//
//        return minStr;
//    }
}
