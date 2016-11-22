package Package126;

import com.sun.javafx.collections.MappingChange;
import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.*;

/**
 * Created by wangzunwen on 2016/11/11.
 */
public class cloneGraph {

    class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;
        UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
  }

  
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

        if( node == null )
            return null;

        Map map = new HashMap<Integer,UndirectedGraphNode>();
        Queue queue = new LinkedList<UndirectedGraphNode>();

        queue.add(node);
        UndirectedGraphNode nnn = new UndirectedGraphNode(node.label);
        map.put(nnn.label,nnn);

        while( !queue.isEmpty() ){
            UndirectedGraphNode nn = (UndirectedGraphNode) queue.poll();

            List ll1 = nn.neighbors;
            UndirectedGraphNode nn2 = (UndirectedGraphNode) map.get(nn.label);
            List ll2 = nn2.neighbors;

            for( int i = 0;i<ll1.size();i++){

                UndirectedGraphNode node2 = (UndirectedGraphNode) ll1.get(i);
                if( map.containsKey(node2.label) ){
                    ll2.add(map.get(node2.label));
                }else{
                    UndirectedGraphNode node3 = new UndirectedGraphNode(node2.label);
                    map.put(node2.label,node3);
                    ll2.add(node3);
                    queue.add(node2);
                }
            }

        }

        return nnn;




    }
}
