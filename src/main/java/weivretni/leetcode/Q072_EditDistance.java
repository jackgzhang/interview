package weivretni.leetcode;

/**
 * <pre>
 * Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)
 * 
 * You have the following 3 operations permitted on a word:
 * 
 * a) Insert a character
 * b) Delete a character
 * c) Replace a character
 * 
 * "a","b"  -> 1
 * 
 * 
 * http://www.programcreek.com/2013/12/edit-distance-in-java/
 * 二维DP
 * 二维DP
 * 
 * if (x=y)  d[i,j] = k[i-1,j-1];
 * if (x!=y) 
 *     {  min of (a,b,c):
 *      path a:  d[i,j] = d[i-1,j] + 1;
 *      path b:  d[i,j] = d[i,j-1] + 1;
 *      path c:  d[i,j] = d[i-1,j-1] + 1;
 *     }
 * 
 * init: 
 * 
 * d[0,i] = i
 * d[j,0] = j
 * 
 * </pre>
 * 
 * 
 * @author gzhang
 * 
 */
public class Q072_EditDistance {

    public int minDistance(String word1, String word2) {

        int[][] d = new int[word1.length() + 1][word2.length() + 1];

        // init
        for (int i = 0; i <= word1.length(); i++) {
            d[i][0] = i;
        }
     
        for (int j = 0; j <= word2.length(); j++) {
            d[0][j] = j;
        }

        // Start calculate
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {

                if (word1.charAt(i) == word2.charAt(j)) {
                    d[i + 1][j + 1] = d[i][j];
                } else {
                    int replace = d[i][j] + 1;
                    int insert = d[i][j + 1] + 1;
                    int delete = d[i + 1][j] + 1;

                    d[i + 1][j + 1] = Math.min(replace, Math.min(insert, delete));
                }
            }
        }

        return d[word1.length()][word2.length()];
    }
}
