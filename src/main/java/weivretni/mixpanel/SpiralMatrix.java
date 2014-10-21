package weivretni.mixpanel;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Given a matrix of integers, write a program to print the elements in spiral order. Consider a matrix as follows:
 * 
 * 01 | 02 | 03 | 04
 * 05 | 06 | 07 | 08
 * 09 | 10 | 11 | 12
 * 13 | 14 | 15 | 16
 * 17 | 18 | 19 | 20 
 * 
 * The output of the program should be as: 1,2,3,4,8,12,16,20,19,18,17,13,9,5,6, 7,11,15,14,10.
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class SpiralMatrix {

    enum DIRECTION {
        EAST, SOUTH, WEST, NORTH
    }

    private DIRECTION getDirection(int dir) {
        dir = dir % 4;

        DIRECTION direction = null;

        switch (dir) {
        case 0:
            direction = DIRECTION.EAST;
            break;
        case 1:
            direction = DIRECTION.SOUTH;
            break;
        case 2:
            direction = DIRECTION.WEST;
            break;
        case 3:
            direction = DIRECTION.NORTH;
            break;
        }
        return direction;
    }

    public List<Integer> printSpiral(int[][] array) {
        List<Integer> result = new ArrayList<Integer>();

        int width = array[0].length;
        int height = array.length;

        // Start point
        int x = 0;
        int y = 0;

        int dir = 0; // start direction
        do {
            result.add(array[x][y]);
            array[x][y] = Integer.MIN_VALUE;

            // Figure out the next position;
            if (getDirection(dir).equals(DIRECTION.EAST)) {
                if (y == width - 1) {
                    dir++; // Change direction
                    x++;
                } else if (y < (width - 1) && array[x][y + 1] == Integer.MIN_VALUE) {
                    dir++; // Change direction
                    x++;
                } else
                    y++;
            } else if (getDirection(dir).equals(DIRECTION.SOUTH)) {
                if (x == height - 1) {
                    dir++; // Change direction
                    y--;
                } else if (y < (height - 1) && array[x + 1][y] == Integer.MIN_VALUE) {
                    dir++; // Change direction
                    y--;
                } else
                    x++;
            } else if (getDirection(dir).equals(DIRECTION.WEST)) {
                if (y == 0) {
                    dir++; // Change direction
                    x--;
                } else if (y > 0 && array[x][y - 1] == Integer.MIN_VALUE) {
                    dir++; // Change direction
                    x--;
                } else
                    y--;
            } else if (getDirection(dir).equals(DIRECTION.NORTH)) {
                if (x == 0) {
                    dir++; // Change direction
                    y++;
                } else if (x > 0 && array[x - 1][y] == Integer.MIN_VALUE) {
                    dir++; // Change direction
                    y++;
                } else
                    x--;
            }

        } while (result.size() != array.length * array[0].length);

        return result;
    }
}
