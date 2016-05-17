package weivretni.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * <pre>
 * iven a 2D board containing 'X' and 'O', capture all regions surrounded by 'X'.
 * 
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 * 
 * For example,
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * After running your function, the board should be:
 * 
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 * </pre>
 * 
 * <pre>
 * http://fisherlei.blogspot.com/2013/03/leetcode-surrounded-regions-solution.html
 * 
 * 转换一下思路，真的需要开辟一个map在存储访问信息吗？其实这个可以省掉的，
 * 既然已经知道连通区域必须至少一个元素是在四边，那么一开始直接从四边开始扫描就好了，所以无法connect到得元素都是应该被清除的。所以，算法如下：
 * 1. 从四条边上的O元素开始BFS，所有相连的O都赋个新值，比如‘Y’
 * 2. 扫描整个数组，所有现存的O元素全部置为X，所有Y元素置为O
 * 打完收工。代码实现如下：
 * </pre>
 *
 */
public class Q130_SurroundedRegions {

    public void solve(char[][] board) {
        List<Integer> xList = new LinkedList<Integer>();
        List<Integer> yList = new LinkedList<Integer>();

        // First, find out all the O in the edge
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O' && (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1)) {
                    xList.add(i);
                    yList.add(j);
                }
            }
        }

        // Second, try one by one to find the O who is close to previous result
        while (!xList.isEmpty()) {
            int x = xList.get(0);
            int y = yList.get(0);

            xList.remove(0);
            yList.remove(0);

            board[x][y] = 'Y';

            if (x > 0 && board[x - 1][y] == 'O') {
                xList.add(x - 1);
                yList.add(y);
            }
            if (x < board.length - 1 && board[x + 1][y] == 'O') {
                xList.add(x + 1);
                yList.add(y);
            }
            if (y > 0 && board[x][y - 1] == 'O') {
                xList.add(x);
                yList.add(y - 1);
            }
            if (y < board[0].length - 1 && board[x][y + 1] == 'O') {
                xList.add(x);
                yList.add(y + 1);
            }
        }

        // Finally, Set all the remaining O->X, Y->O
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }

                if (board[i][j] == 'Y') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
