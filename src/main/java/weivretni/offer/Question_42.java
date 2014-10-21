package weivretni.offer;

public class Question_42 {

    private void reverse(char[] s, int i, int j) {
        while (i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;

            i++;
            j--;
        }
    }

    public char[] doIt(char[] s) {
        reverse(s, 0, s.length - 1);

        int i = 0;
        int j = 1;

        while (j < s.length) {
            if (s[j] != ' ') {
                j++;
            } else {
                reverse(s, i, j - 1);

                while (s[j] == ' ') {
                    j++;
                }

                i = j;

            }
        }
        
        reverse(s, i, j - 1);

        return s;
    }
}
