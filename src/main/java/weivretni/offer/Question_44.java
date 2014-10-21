package weivretni.offer;

public class Question_44 {

    private void partition(int[] numbers, int begin, int end) {

        int i = begin;
        int j = end;

        int pivot = i + (j - i) / 2;
        int pivotV = numbers[pivot];

        while (i <= j) {
            while (numbers[i] < pivotV) {
                i++;
            }
            while (numbers[j] > pivotV) {
                j--;
            }

            if (i <= j) {
                int tmp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = tmp;
                i++;
                j--;
            }
        }

        if (begin < j)
            partition(numbers, begin, j);

        if (i < end)
            partition(numbers, i, end);

    }

    public boolean doIt(int[] numbers) {
        partition(numbers, 0, numbers.length - 1);

        // Count gap
        int gap = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] - numbers[i] > 1) {
                gap++;
            }

            if (numbers[i + 1] == numbers[i] && numbers[i] != 0)
                return false;
        }

        if (gap > 0) {
            // count 0
            int numboerOfZero = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 0) {
                    numboerOfZero++;
                }
            }

            if (gap == numboerOfZero) {
                return true;
            } else {
                return false;
            }
        }

        return true;
    }
}
