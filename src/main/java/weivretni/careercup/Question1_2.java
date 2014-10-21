package weivretni.careercup;

public class Question1_2 {

    private int count2Helper(int n) {

        int total = 0;

        String s = "" + n;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '2') {
                total++;
            }
        }

        if (total > 0) {
            System.out.println(n);
        }

        return total;
    }

    public int count2BrutalForce(int n) {

        System.out.println("=====" + n + "======");

        int total = 0;

        for (int i = 0; i <= n; i++) {
            total += count2Helper(i);
        }

        return total;
    }
}
