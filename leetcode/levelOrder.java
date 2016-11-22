package leetcode101;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class levelOrder {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
public List<List<Integer>> levelOrder(TreeNode root) {
        List list = new ArrayList<List<Integer>>();
        
        if( root == null)
        	return list;
        List ans1 = new ArrayList<Integer>();
        ans1.add(root.val);
        list.add(ans1);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while( !queue.isEmpty() ){
        	List ans = new ArrayList<Integer>();
        	for( int i = 0;i<queue.size();i++){
        		TreeNode node = queue.poll();
        		if( node == null)
        			continue;
        		ans.add(node.val);
        		queue.add(node.left);
        		queue.add(node.right);
        	}
        	list.add(ans);
        	
        }
        
        
        return list;
    }
}
