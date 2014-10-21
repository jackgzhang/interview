package weivretni.careercup;

public class Question1_1 {

    public int recursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursive(n - 1) + recursive(n - 2);
        }
    }

    public int iterative(int n) {
        if (n == 0) {
            return 0;
        }

        int a = 1;
        int b = 1;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;

    }
}
