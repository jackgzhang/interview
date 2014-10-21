package weivretni;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        Collection<String> myCollection = new ArrayList<String>(10);
        myCollection.add("123");
        myCollection.add("456");
        myCollection.add("789");
        for (Iterator it = myCollection.iterator(); it.hasNext();) {
            String myObject = (String) it.next();
            System.out.println(myObject);
            if (true) {
                myCollection.remove(myObject); // can throw ConcurrentModificationException in
                                               // single as //well as multi-thread access
                                               // situations.
            }
        }
    }
}
