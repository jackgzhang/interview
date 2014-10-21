package weivretni.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author gzhang
 * 
 */
public class Question_12 {

    public List<String> doIt(int n) {

        List<String> newList = new ArrayList<String>();

        if (n == 0) {
            newList.add("");
        } else {
            List<String> previous = doIt(n - 1);
            for (String str : previous) {
                for (int i = 0; i <= 9; i++) {
                    newList.add(i + "" + str);
                }
            }
        }

        return newList;
    }

    public static void main(String[] args) {
        Question_12 source = new Question_12();
        List l = source.doIt(2);
        for (Object o : l) {
            System.out.println(o);
        }
    }
}
