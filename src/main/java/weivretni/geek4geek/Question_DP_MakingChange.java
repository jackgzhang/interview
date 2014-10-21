package weivretni.geek4geek;

/**
 * 
 * Dynamic Programming problem:
 * 
 * <p>
 * <b> Making Change.</b>
 * <p>
 * You are given n types of coin denominations of values v(1) < v(2) < ... < v(n) (all integers).
 * Assume v(1) = 1, so you can always make change for any amount of money C. Give an algorithm which
 * makes change for an amount of money C with as few coins as possible. [on problem set 4]
 * 
 * <b>note:</b> The n < c. Otherwise just return 1;
 * 
 * http://people.csail.mit.edu/bdean/6.046/dp/
 * 
 * @author gzhang
 * 
 */
public class Question_DP_MakingChange {

    public int getMinChanges(int coinType, int amount) {

        if (coinType >= amount) {
            return 1;
        }

        int minSoFar = Integer.MAX_VALUE;

        for (int i = 1; i <= coinType; i++) {
            int min = getMinChanges(coinType, amount - i);
            if (minSoFar > min) {
                minSoFar = min;
            }
        }
        return minSoFar + 1;
    }

    public int getMinChanges2(int coinType, int amount) {
        if (coinType >= amount) {
            return 1;
        }

        int remain = amount - (amount / coinType) * coinType;

        if (remain == 0)
            return amount / coinType;
        else
            return amount / coinType + 1;

    }
}
