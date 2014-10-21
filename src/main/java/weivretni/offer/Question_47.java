package weivretni.offer;

public class Question_47 {

    public int doIt(int num1, int num2) {
        int sum, carry;
        do {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;

            num1 = sum;
            num2 = carry;

        } while (num2 != 0);

        return num1;
    }
}
