package weivretni.common;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Trie_1_Test {

    Trie_1 source = new Trie_1();
    
    @Test
    public void test() {
        
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("bee");
        list.add("cat");
        
        System.out.println(source.find(list));
        
        list.add("cedd");
        source = new Trie_1();
        System.out.println(source.find(list));
    }
}
