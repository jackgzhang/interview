package weivretni;

import java.util.LinkedList;
import java.util.List;

public class Trie {

    public class Node {

        char       content;
        List<Node> children;
        Node       parent;

        public Node(char cnt) {
            children = new LinkedList<Node>();
            content = cnt;
        }

        public Node getSubNode(char cnt) {

            for (Node child : children) {
                if (child.content == cnt) {
                    return child;
                }
            }

            return null;
        }

        public List<Node> getChildren() {
            return children;
        }

        public char getContent() {
            return content;
        }

        public Node getParent() {
            return parent;
        }
        
        public String toString() {
            StringBuilder s = new StringBuilder();
            for (Node child: children) {
                s.append(child.getContent()).append("-");
            }
            
            return s.toString();
        }

    }

    private Node root;

    public Trie() {
        root = new Node(' ');
    }

    public Node getRoot() {
        return root;
    }

    public void insert(String s) {
        if (s.length() == 0) {
            return;
        } else {

            Node currNode = root;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                Node childNode = currNode.getSubNode(c);
                if (childNode == null) {
                    // Create new child noe
                    childNode = new Node(c);
                    childNode.parent = currNode;
                    currNode.children.add(childNode);
                }

                currNode = childNode;
            }
        }
    }
}
