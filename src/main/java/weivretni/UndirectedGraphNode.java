package weivretni;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraphNode {

    public int label;
    public List<UndirectedGraphNode> neighbors;

    public UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(label);
        sb.append(":");
        
        for (UndirectedGraphNode node : neighbors) {
            sb.append(node.label).append(",");
        }
        
        return sb.toString();
    }

}
