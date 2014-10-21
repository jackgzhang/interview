package weivretni.careercup;

public class Question1_6 {

    public int add(int a, int b) {

        if (a == 0) {
            return b;
        }

        int a_b = a ^ b;
        int carrage = (a & b) << 1;

        return add(carrage, a_b);
    }
}
