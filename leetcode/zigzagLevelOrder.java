package leetcode101;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class zigzagLevelOrder {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    
    
    List list = new ArrayList<List<Integer>>();
    if( root == null)
    	return list;
    Deque<TreeNode> queue = new LinkedList<TreeNode>();
    Deque<TreeNode> queue1 = new LinkedList<TreeNode>();
    queue.add(root);
    int dir = 0;
    while( !queue.isEmpty() ){
    	List ans = new ArrayList<Integer>();
    	int size = queue.size();
    	for( int i = 0;i<size;i++){
    		TreeNode node = null;
    		if( dir == 0)
    			node = queue.poll();
    		else
    			node = queue.pollLast();
    			
    		if( node == null)
    			continue;
    		ans.add(node.val);
    		if( dir == 0){
    		    queue1.add(node.left);
   			    queue1.add(node.right);
    		}else{
    		    queue1.addFirst(node.right);
    		    queue1.addFirst(node.left);
    		}
    	}
    	if( !ans.isEmpty() )
    		list.add(ans);
    	queue.addAll(queue1);
    	queue1.clear();
    	dir = (dir == 1?0:1);
    }

    return list;



}
}
