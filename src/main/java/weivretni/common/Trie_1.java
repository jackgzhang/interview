package weivretni.common;

import java.util.LinkedList;
import java.util.List;

import weivretni.Trie;

/**
 * Write code to compute the shortest unique prefix of each word in a set of words.
 * 
 * 给的例子是： 譬如如果apple, bee, cat这三个词， 那找到的shortest unique prefix 就是｛a/b/c ｝;
 * <p/>
 * 如果是apple bee cat cedar, 就需要 {a/b/ca/ ce}
 * 
 * @author gzhang
 * 
 */
public class Trie_1 {

    private List<String> result = new LinkedList<String>();

    private String getString(Trie.Node node) {
        String s = "" + node.getContent();
        
        Trie.Node tmp = node;
        
        while (tmp.getParent() != null) {
            tmp = tmp.getParent();
            if (tmp.getContent() != ' ') {
                s = (tmp.getContent()) + s;
            }
        }

        return s.toString();
    }

    private void helper(Trie.Node node) {
        if (node.getChildren().size() <= 1) {
            result.add(getString(node));
        } else {
            for (Trie.Node child : node.getChildren()) {
                helper(child);
            }
        }
    }

    public List<String> find(List<String> input) {
        Trie trie = new Trie();

        for (String s : input) {
            trie.insert(s);
        }

        Trie.Node root = trie.getRoot();
        helper(root);

        return result;
    }
}
