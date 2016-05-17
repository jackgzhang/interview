package weivretni.leetcode;//package weivretni.leetcode;
//
//import java.util.HashMap;
//import java.util.Map;
//x
///**
// * <pre>
// * Given a string S and a string T, find the minimum window in S which will contain all
// *
// * the characters in T in complexity O(n).
// *
// * For example,
// * S = "ADOBECODEBANC"
// * T = "ABC"
// * Minimum window is "BANC".
// *
// * Note:
// * If there is no such window in S that covers all characters in T, return the emtpy string "".
// *
// * If there are multiple such windows, you are guaranteed that there will always be only one unique
// *
// * minimum window in S.
// * </pre>
// *
// * <pre>
// * http://huntfor.iteye.com/blog/2083485
// *
// * 可以利用两个指针扫描（两个指针分别为start，i），以S = “e b a d b a c c b”（忽略空格），T = “abc”为例：
// *
// * 0 1 2 3 4 5 6 7 8
// *
// * 初始化 start = i = 0
// * 1）i 逐渐往后扫描S直到窗口S[start…i]包含所有T的字符，此时i = 6（字符c的位置）
// * 2）缩减窗口：此时我们注意到窗口并不是最小的，需要调整 start 来缩减窗口。
// *    缩减规则为：如果S[start]不在T中 或者 S[start]在T中但是删除后窗口依然可以包含T中的所有字符，那么start = start+1， 直到不满足上述两个缩减规则。缩减后i即为窗口的起始位置，此例中从e开始窗口中要依次删掉e、b、a、d，start最后等于4 ，那么得到一个窗口大小为6-4+1 = 3
// * 3）start = start+1(此时窗口肯定不会包含所有的T中的字符)，跳转到步骤1继续寻找下一个窗口。
// *    本例中还以找到一个窗口start = 5，i = 8，比上个窗口大，因此最终的最小窗口是S[4…6]
// *
// * 具体实现时，要用哈希表来映射T中字符以便在O(1)时间内判断一个字符是否在T中，由于是字符缘故，可以用数组简单的来实现；
// *
// * </pre>
// *
// *
// */
//public class Q076_MinimumWindowSubstring {
//
//    public String minWindow(String S, String T) {
//        if (S == null || S.length() == 0 || T == null || T.length() == 0 || T.length() > S.length()) {
//            return "";
//        } else {
//
//            // Init
//            Map<String, Integer> original = new HashMap<String, Integer>();
//            Map<String, Integer> map = new HashMap<String, Integer>();
//            for (int i = 0; i < T.length(); i++) {
//                String key = T.charAt(i) + "";
//
//                if (original.containsKey(key)) {
//                    original.put(key, original.get(key) + 1);
//                } else {
//                    original.put(key, 1);
//                }
//            }
//
//            // Calc
//            int max = Integer.MAX_VALUE;
//            int minStart = -1;
//            int minEnd = -1;
//
//            int start = 0;
//            int end = 0;
//            while (end < S.length()) {
//
//                String key = S.charAt(end) + "";
//                if (original.containsKey(key)) {
//
//                    if (map.containsKey(key)) {
//                        map.put(key, map.get(key) + 1);
//                    } else {
//                        map.put(key, 1);
//                    }
//
//                    if (allExist(map, original)) {
//                        if (end - start < max) {
//                            minEnd = end;
//                            minStart = start;
//                        }
//
//                        // Now increase start, to shrink the window
//                        while (start <= end) {
//
//                            String charAtStart = S.charAt(start) + "";
//                            if (map.containsKey(charAtStart)) {
//                                map.put(charAtStart, map.get(charAtStart) - 1);
//                            }
//
//                            start++;
//
//                            if (!allExist(map, original)) {
//
//                                if (end - start < max) {
//                                    minEnd = end;
//                                    minStart = start - 1;
//                                }
//
//                                break;
//                            }
//                        }
//                    }
//                }
//                end++;
//            }
//
//            if (minStart == -1) {
//                return "";
//            }
//            return S.substring(minStart, minEnd + 1);
//        }
//    }
//
//    private boolean allExist(Map<String, Integer> map, Map<String, Integer> goldenMap) {
//        for (Map.Entry<String, Integer> entry : goldenMap.entrySet()) {
//
//            String key = entry.getKey();
//
//            if (map.containsKey(key) && map.get(key).equals(entry.getValue())) {
//                continue;
//            } else {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}
