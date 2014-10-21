package weivretni.offer;

import java.util.ArrayList;
import java.util.List;

public class Question_41 {

    public String doIt(int[] numbers, int sum) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {

            int temp = numbers[i] + numbers[j];

            if (temp == sum) {
                break;
            } else if (temp < sum) {
                i++;
            } else if (temp > sum) {
                j--;
            }
        }

        if (i > j)
            return "";
        else
            return numbers[i] + "," + numbers[j];
    }

    private int sum(int[] numbers, int from, int to) {
        int sum = 0;

        for (int i = from; i <= to; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    /**
     * question 2. Find all the possible combinations
     * 
     * @param numbers
     * @param sum
     * @return
     */
    public List<String> doIt2(int[] numbers, int sum) {
        int i = 0;
        int j = 1;

        List<String> result = new ArrayList<String>();
        while (i < numbers.length && j < numbers.length) {

            int sumSoFar = sum(numbers, i, j);

            if (sumSoFar == sum) {
                result.add(i + "," + j);
                j++;
            } else if (sumSoFar < sum) {
                j++;
            } else if (sumSoFar > sum) {
                i++;
            }
        }

        return result;
    }
}
