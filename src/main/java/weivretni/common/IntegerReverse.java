package weivretni.common;

/**
 * 把一个integer convert 一下， 比如 input 是123， 生成321。 延伸一下如果是 负数怎么办。 (Answer: The same logic work for 负数)
 * 
 * @author gzhang
 * 
 */
public class IntegerReverse {

    public int reverse(int input) {

        int reversedNum = 0;

        while (input != 0) {
            reversedNum = reversedNum * 10 + input % 10;
            input = input / 10;
        }

        return reversedNum;
    }
}
