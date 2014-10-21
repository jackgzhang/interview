package weivretni.offer;

public class Question_29 {

    /**
     * Return the pivot position after partition
     * 
     * @param numbers
     * @param low
     * @param high
     * @return
     */
    private int partition(int[] numbers, int low, int high) {

        int middle = low + (high - low) / 2;
        int pivot = numbers[middle];

        int i = low;
        int j = high;
        while (i < j) {
            while (numbers[i] < pivot) {
                i++;
            }

            while (numbers[j] > pivot) {
                j--;
            }

            if (i < j) {
                int tmp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = tmp;
                i++;
                j--;
            }
        }

        if (j > middle) {
            return partition(numbers, low, j);
        } else if (j < middle) {
            return partition(numbers, i, high);
        } else {
            return j;
        }
    }

    private int moreThanHalfNum(int[] numbers) {
        int result = numbers[0];
        int times = 1;
        for (int i = 1; i < numbers.length; ++i) {
            if (times == 0) {
                result = numbers[i];
                times = 1;
            } else if (numbers[i] == result) {
                times++;
            } else {
                times--;
            }
        }

        return result;
    }

    public int solution1(int[] numbers) {
        return partition(numbers, 0, numbers.length - 1);
    }

    public int solution2(int[] numbers) {
        return moreThanHalfNum(numbers);
    }
}
