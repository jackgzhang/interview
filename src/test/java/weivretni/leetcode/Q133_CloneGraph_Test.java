package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.UndirectedGraphNode;

public class Q133_CloneGraph_Test extends BaseTest {

    private Q133_CloneGraph source = new Q133_CloneGraph();

    @Test
    public void test() {
        // Assert.assertEquals(6, source.candy(new int[] { 1, 2, 3 }));
        UndirectedGraphNode node = this.buildUndirectedGraphNode("0,0,0");
        UndirectedGraphNode node2 =  source.cloneGraph(node);
        System.out.println(node2);
        
        node = this.buildUndirectedGraphNode("0,1,2#1,2#2,2");
        node2 =  source.cloneGraph(node);        
        System.out.println(node2);
    }
}
