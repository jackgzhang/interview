package weivretni.offer;

import weivretni.Utils;


public class Question_31 {

    /**
     * A simple iteration will resolve it
     * 
     * @return
     */
    public int version1(int[] values) {
        int max = Integer.MIN_VALUE;
        int sumSoFar = 0;

        for (int value : values) {
            sumSoFar += value;

            if (sumSoFar > max) {
                max = sumSoFar;
            }
            if (sumSoFar < 0) {
                sumSoFar = 0;
            }
        }

        return max;
    }

    /**
     * Dynamic programming
     * 
     * @param values
     * @return
     */
    public int version2(int[] values) {

        if (values.length == 1) {
            return values[0];
        } else {
            int max = version2(Utils.subArray(values, 0, values.length - 2));
            if (max <= 0) {
                return values[values.length - 1];
            } else {
                return max + values[values.length - 1];
            }
        }
    }
}
