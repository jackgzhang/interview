package weivretni.offer;

import weivretni.Utils;


public class Question_24 {

    private boolean lessThan(int[] array, int root) {
        for (int value : array) {
            if (value > root) {
                return false;
            }
        }
        return true;
    }

    private boolean biggerThan(int[] array, int root) {
        for (int value : array) {
            if (value < root) {
                return false;
            }
        }
        return true;
    }

    public boolean doIt(int[] array) {
        if (array.length <= 2) {
            return true;
        } else {
            // Left side is less than root
            boolean lessThan = lessThan(Utils.subArray(array, 0, array.length / 2 - 1), array[array.length - 1]);
            
            // Right side is bigger than root
            boolean biggerThan = biggerThan(Utils.subArray(array, array.length / 2, array.length - 2), array[array.length - 1]);

            return (lessThan && biggerThan && doIt(Utils.subArray(array, 0, array.length / 2 - 1)) && doIt(Utils.subArray(array, array.length / 2, array.length - 2)));

        }
    }
}
