package weivretni.leetcode;

import org.junit.Test;

public class Q146_LRUCache_Test {

    @Test
    public void test() {

        // Q060_LRUCache source = new Q060_LRUCache(1);
        // source.set(2, 1);
        // System.out.println(source.get(2));
        // source.set(3, 2);
        // System.out.println(source.get(2));
        // System.out.println(source.get(3));

        Q146_LRUCache source = new Q146_LRUCache(2);
        source.set(2, 1);
        source.set(1, 1);
        System.out.println(source.get(2));
        source.set(4, 1);
        System.out.println(source.get(1));
        System.out.println(source.get(2));
    }
}
