package weivretni.lintcode;

public class CompareStrings {

    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return : if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        int[] index = new int[26];

        if (B.length() == 0) {
            return true;
        }

        if (A.length() == 0 && B.length() > 0) {
            return false;
        }

        for (int i = 0; i < A.length(); i++) {
            index[A.charAt(i) - 'A'] = index[A.charAt(i) - 'A'] + 1;
        }

        for (int i = 0; i < B.length(); i++) {
            if (index[B.charAt(i) - 'A'] == 0) {
                return false;
            } else {
                index[B.charAt(i) - 'A'] = index[B.charAt(i) - 'A'] - 1;
            }
        }

        return true;
    }
}
