package weivretni.common;

public class QuickSort {

    private void quicksort(int[] numbers, int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high - low) / 2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                // exchange(i, j);

                int tmp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = tmp;

                i++;
                j--;
            }
        }
        // Recursion
        quicksort(numbers, low, j);
        quicksort(numbers, i, high);
    }

    private String toString(int[] values) {
        StringBuffer sb = new StringBuffer();
        for (int value : values) {
            sb.append(value).append(",");
        }

        return sb.toString();
    }

    public String doIt(int[] values) {
        if (values == null || values.length == 0) {
            return "";
        }
        int number = values.length;
        quicksort(values, 0, number - 1);

        return toString(values);
    }
}
