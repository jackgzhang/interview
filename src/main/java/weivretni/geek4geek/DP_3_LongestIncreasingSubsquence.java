package weivretni.geek4geek;

/**
 * 
 * http://www.geeksforgeeks.org/dynamic-programming-set-3-longest-increasing-subsequence/
 * 
 * https://www.youtube.com/watch?v=U-xOVWlcgmM
 * 
 * 
 * LIS for { 10, 22, 9, 33, 21, 50, 41, 60, 80 } is 6 and LIS is {10, 22, 33, 50, 60, 80}
 * 
 * 
 * @author gzhang
 * 
 */
public class DP_3_LongestIncreasingSubsquence {

    private T helper(int[] array, int index) {
        if (index == 0) {
            return new T(1, array[0]);
        } else {
            T maxT = new T(0, 0);
            for (int i = 0; i < index; i++) {
                T eachMaxT = helper(array, i);
                if (eachMaxT.getLastOne() < array[index] && eachMaxT.getLength() > maxT.getLength()) {
                    maxT = eachMaxT;
                }
            }

            maxT = new T(maxT.getLength() + 1, array[index]);

            System.out.println(index + " max value is " + maxT.getLastOne() + ", max Length is : " + maxT.getLength());
            return maxT;
        }
    }

    public int doIt(int[] array) {

        int max = 0;

        for (int i = 0; i < array.length; i++) {

            int tmp = helper(array, i).getLength();

            if (max < tmp) {
                max = tmp;
            }
        }

        return max;
    }

    class T {

        private int length;
        private int lastOne;

        public T() {
            length = 0;
            lastOne = 0;
        }

        public T(int length, int lastOne) {
            super();
            this.length = length;
            this.lastOne = lastOne;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getLastOne() {
            return lastOne;
        }

        public void setLastOne(int lastOne) {
            this.lastOne = lastOne;
        }

    }
}
