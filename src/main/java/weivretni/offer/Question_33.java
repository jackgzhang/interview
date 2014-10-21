package weivretni.offer;

import weivretni.Utils;


public class Question_33 {

    private String insert(int[] numbers, int number, int pos) {

        String result = "";

        for (int i = 0; i < pos; i++) {
            result += String.valueOf(numbers[i]);
        }

        result += String.valueOf(number);

        for (int i = pos; i < numbers.length; i++) {
            result += String.valueOf(numbers[i]);
        }

        return result;
    }

    private int[] insertMe(int[] numbers, int number, int pos) {

        int result[] = new int[numbers.length + 1];

        int j = 0;
        for (int i = 0; i < pos; i++) {
            result[i] = numbers[i];
            j++;
        }
        result[pos] = number;
        j++;
        for (int i = pos; i < numbers.length; i++) {
            result[j++] = numbers[i];
        }

        return result;

    }

    private boolean isSmaller(String s1, String s2) {

        if (s2.length() == 0)
            return true;

        boolean result = true;

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (Integer.valueOf(c1) > Integer.valueOf(c2)) {
                result = false;
                break;
            } else if (Integer.valueOf(c2) > Integer.valueOf(c1)) {
                result = true;
                break;
            }
        }

        return result;
    }

    public int[] doIt(int[] numbers) {
        if (numbers.length == 1) {
            return numbers;
        } else {
            int[] soFar = doIt(Utils.subArray(numbers, 0, numbers.length - 2));

            String smallest = new String("");
            int smallestIndex = 0;
            for (int i = 0; i <= soFar.length; i++) {
                String s = insert(soFar, numbers[numbers.length - 1], i);
                if (isSmaller(s, smallest)) {
                    smallest = s;
                    smallestIndex = i;
                }
            }

            return insertMe(soFar, numbers[numbers.length - 1], smallestIndex);
        }
    }
}
