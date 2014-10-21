package weivretni.geek4geek;


/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-14-maximum-sum-increasing-subsequence/
 * 
 * @author gzhang
 * 
 */
public class DP_14_MaximumSumIncreasingSubsequence {

    class T {

        private int sum;
        private int lastOne;

        public T() {
            sum = 0;
            lastOne = 0;
        }

        public T(int sum, int lastOne) {
            super();
            this.sum = sum;
            this.lastOne = lastOne;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }

        public int getLastOne() {
            return lastOne;
        }

        public void setLastOne(int lastOne) {
            this.lastOne = lastOne;
        }

    }

    private T helper(int[] numbers, int index) {
        if (index == 0) {
            return new T(numbers[0], numbers[0]);
        }

        T max = new T(0, 0);
        for (int i = 0; i < index; i++) {

            T soFar = helper(numbers, i);
            if (soFar.lastOne < numbers[index] && soFar.getSum() > max.getSum()) {
                max = soFar;
            }
        }

        max.lastOne = numbers[index];
        max.sum = max.sum + numbers[index];
        return max;

    }

    public int doIt(int[] numbers) {
        int maxSum = 0;

        for (int i = 0; i < numbers.length; i++) {

            int maxAtIndex = helper(numbers, i).getSum();

            if (maxSum < maxAtIndex) {
                maxSum = maxAtIndex;
            }
        }
        return maxSum;
    }
}
