package weivretni.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * 
 * Return all possible palindrome partitioning of s.
 * 
 * For example, given s = "aab",
 * Return
 * 
 *   [
 *     ["aa","b"],
 *     ["a","a","b"]
 *   ]
 * </pre>
 * 
 * 
 * <pre>
 * 
 * http://blog.csdn.net/ljphhj/article/details/22573983
 * 
 * 解题思路：（跟DFS深度遍历有点像!）
 * 
 * 字符串Str = "aab";
 * 
 * 分析了题目的数据之后，我们知道它的结果，可能是 a, a, b 或者  aa, b 这样的情况！
 * 
 * 也就是说，我们需要去考虑 i = 1,  2 ....  n 的情况，比如
 * 
 * Str = "aaa"
 * 
 * 结果集
 * 
 * 
 * [[a, a, a], [a, aa], [aa, a], [aaa]]
 * 
 * 根据这样的情况，我们用类似于DFS的算法
 * 
 * str1 = str.substr(0, i); 取出前面下标从 0 开始到 i 结束的子串，判断str1是否满足回文字符串的要求，
 * 
 * 1. 满足：这样子，有可能成为一种分割的情况，所以我们new出一个list集合，把str1放入到list中，然后我们求出str剩余的子串  
 *  
 *    str2 = str.substr(i); 取出前面下标从 i 开始到整个字符串结尾的子串， 然后将str2 作为新的字符串，
 *    
 *    同时把list集合也传入到函数中，递归调用。递归的结束条件就是到传入的这个字符串的长度为0（这样就意味着已经到了字符串的末尾了），
 *    
 *    此时证明这种情况下得到的list集合是满足条件的，我们把这个list集合 加入到 结果集合result中。
 * 
 * 2. 不满足的话，继续 i++， 直到 i == str.length();
 * 
 * 3. 全部结束之后，返回 最终的结果集合 result
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q131_PalindromePartitioning {

    private List<List<String>> result = null;

    public List<List<String>> partition(String s) {

        result = new ArrayList<List<String>>();

        if (s == null || s.length() == 0) {
            return result;
        } else {
            helper(s, new ArrayList<String>());

            return result;
        }
    }

    private void helper(String s, List<String> curr) {
        if (s.length() == 0) {
            result.add(new ArrayList(curr));
        } else {
            for (int i = 1; i <= s.length(); i++) {
                String str1 = s.substring(0, i);
                if (isPalindrome(str1)) {
                    curr.add(str1);
                    helper(s.substring(i), curr);
                    curr.remove(curr.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            return (s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome(s.substring(1, s.length() - 1)));
        }
    }
}
