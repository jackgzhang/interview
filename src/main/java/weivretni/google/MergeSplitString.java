package weivretni.google;

/**
 * Given a string, split() will split into tokens. merge() will merge it back
 * 
 * @author gzhang
 * 
 */
public class MergeSplitString {

    char spliter = 'c';

    public static String merge(String[] s) {
        return "";
    }

    public static String[] split(String s) {
        return s.split(s);
    }

    public static void main(String[] args) {

        String str = "qwercasdfas";

        if (str.equals(merge(split(str)))) {
            System.out.println("ok");
        }
    }
}
