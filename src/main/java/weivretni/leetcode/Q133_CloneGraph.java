package weivretni.leetcode;

import weivretni.UndirectedGraphNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * <pre>
 * Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.
 * 
 * 
 * OJ's undirected graph serialization:
 * Nodes are labeled uniquely.
 * 
 * We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
 * As an example, consider the serialized graph {0,1,2#1,2#2,2}.
 * 
 * The graph has a total of three nodes, and therefore contains three parts as separated by #.
 * 
 * First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 * Second node is labeled as 1. Connect node 1 to node 2.
 * Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
 * Visually, the graph looks like the following:
 * 
 *        1
 *       / \
 *      /   \
 *     0 --- 2
 *          / \
 *          \_/
 * </pre>
 * 
 * 
 * 
 * <pre>
 * 
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 * 
 * </pre>
 * 
 * <pre>
 * http://www.programcreek.com/2012/12/leetcode-clone-graph-java/
 * 
 * 
 * 1.  Use a map to keep track of:  OldNode->NewNode
 * 2.  Use a queue to keep track of current visiting node's neighbors  (A queue is used to do breath first traversal.)
 * 3.  
 * </pre>
 */
public class Q133_CloneGraph {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

        if (node == null) {
            return null;
        }

        // ================= Maps oldNode->NewNode =================== //
        Map<UndirectedGraphNode, UndirectedGraphNode> noteMap = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();

        // ================= Keep track of current neighbors which are not visited.================= //
        LinkedList<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();

        UndirectedGraphNode newHead = new UndirectedGraphNode(node.label);
        noteMap.put(node, newHead);

        queue.add(node);

        while (!queue.isEmpty()) {
            UndirectedGraphNode curr = queue.pop();

            for (UndirectedGraphNode neighbour : curr.neighbors) {
                if (noteMap.containsKey(neighbour)) {
                    // =========== If the node already exists, then just setup the relationship ========== //
                    UndirectedGraphNode newNeighbour = noteMap.get(neighbour);
                    
                    // Setup this relation.  We DO NOT need to setup the reverse relation since it will be mentioned later on
                    noteMap.get(curr).neighbors.add(newNeighbour);


                }else{
                    UndirectedGraphNode copy = new UndirectedGraphNode(neighbour.label);
                    noteMap.put(neighbour, copy);
                    
                    // Setup relation
                    noteMap.get(curr).neighbors.add(copy);
                    
                    // Add the neighbor to the queue.
                    queue.add(neighbour);
                }
            }
        }
        
        return newHead;
    }

}
