package weivretni.mixpanel;

import java.util.HashMap;
import java.util.Map;

public class Sudoku {

    public boolean is_valid_sudoku_solution(String grid) {
        char[][] gridInArray = convert(grid);

        if (gridInArray != null) {
            return isCubeValid(gridInArray) && isRowsValid(gridInArray) && isColumnsValid(gridInArray);
        } else {
            return false;
        }
    }

    /**
     * Convert string representation to double char array.
     * 
     * @param grid
     * @return null if the grid is not a valid representation
     */
    private char[][] convert(String grid) {
        if (grid != null && grid.length() == 81) {

            char[][] result = new char[9][9];

            int row = -1;
            int column = 0;

            for (int i = 0; i < 81; i++) {

                // For every 9th number, increase the row counter and reset column counter.
                if (i % 9 == 0) {
                    row++;
                    column = 0;
                }

                if ("123456789".indexOf(grid.charAt(i)) == -1) {
                    return null;
                }

                result[row][column++] = grid.charAt(i);
            }

            return result;

        }

        return null;
    }

    /**
     * Make sure each row is valid. Valid means no duplicate values
     * 
     * @return
     */
    private boolean isRowsValid(char[][] grid) {

        Map<String, Integer> existingValueMap = new HashMap<String, Integer>();

        for (int row = 0; row < 8; row++) {

            existingValueMap.clear();

            for (int column = 0; column < 8; column++) {
                String anumber = "" + grid[row][column];

                if (existingValueMap.containsKey(anumber)) {
                    // Early return false if found duplicates
                    return false;
                } else {
                    existingValueMap.put(anumber, 1);
                }
            }
        }

        return true;
    }

    /**
     * Make sure each column is valid. Valid means no duplicate values
     * 
     * @return
     */
    private boolean isColumnsValid(char[][] grid) {
        Map<String, Integer> existingValueMap = new HashMap<String, Integer>();

        for (int column = 0; column < 8; column++) {

            existingValueMap.clear();

            for (int row = 0; row < 8; row++) {
                String anumber = "" + grid[row][column];

                if (existingValueMap.containsKey(anumber)) {
                    // Early return false if found duplicates
                    return false;
                } else {
                    existingValueMap.put(anumber, 1);
                }
            }
        }

        return true;
    }

    /**
     * Make sure each box is valid. Valid means no duplicate values
     * 
     * @return
     */
    private boolean isCubeValid(char[][] grid) {

        Map<String, Integer> existingValueMap = new HashMap<String, Integer>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Following is to fetch value from each box

                existingValueMap.clear();

                for (int row = 3 * i; row < 3 * i + 3; row++) {

                    for (int column = 3 * j; column < 3 * j + 3; column++) {
                        String anumber = "" + grid[row][column];
                        if (existingValueMap.containsKey(anumber)) {
                            // Early return false if found duplicates
                            return false;
                        } else {
                            existingValueMap.put(anumber, 1);
                        }

                    }
                }

            }
        }

        return true;
    }

}
