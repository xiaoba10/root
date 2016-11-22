package Package126;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wangzunwen on 2016/11/6.
 */
public class sumNumbers {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int sumNumbers(TreeNode root) {

    	if( root == null )
    		return 0;
    	int result = 0;
        Queue queue = new LinkedList<TreeNode>();
        queue.add(root);

        while( !queue.isEmpty() ){

        	int size = queue.size();
        	for( int i = 0;i<size;i++){
        		TreeNode node = (TreeNode) queue.poll();
        		if( node.left != null ){
        			node.left.val = node.val*10+node.left.val;
        			queue.add(node.left);
        		}
        		if( node.right != null){
        			node.right.val = node.right.val+node.val*10;
        			queue.add(node.left);
        		}
        		if( node.left == null && node.right == null )
        			result+=node.val;
        	}


        }

        return result;

    }
}
