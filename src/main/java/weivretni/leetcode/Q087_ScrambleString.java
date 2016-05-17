package weivretni.leetcode;

public class Q087_ScrambleString {

    public boolean isScramble(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        if (s1.length() == 1) {
            return s1.equals(s2);
        }

        for (int i = 1; i < s1.length(); i++) {
            String s11 = s1.substring(0, i);
            String s12 = s1.substring(i, s1.length());

            String s21 = s2.substring(0, i);
            String s22 = s2.substring(i, s2.length());

            if (isScramble(s11, s21) && isScramble(s12, s22)) {
                return true;
            }

            s21 = s2.substring(s2.length() - i, s2.length());
            s22 = s2.substring(0, s2.length() - i);

            if (isScramble(s11, s21) && isScramble(s12, s22)) {
                return true;
            }
        }

        return false;
    }

}
