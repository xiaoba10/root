package leetcode101;

import java.util.LinkedList;
import java.util.Queue;

import leetcode101.buildTree2.TreeNode;

public class minDepth {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
public int minDepth(TreeNode root) {

		if( root == null){
			return 0;
		}

		Queue queue = new LinkedList<TreeNode>();     
		queue.add(root);
		int dep = 0;
		while( !queue.isEmpty() ){
			int size = queue.size();
			for( int i = 0;i<size;i++){
				TreeNode node = (TreeNode) queue.poll();
				if( node.left == null && node.right == null )
					return dep;
				if( node.left != null)
					queue.add(node.left);
				if( node.right != null)
					queue.add(node.right);

			}
			dep++;
		}
		return dep;

    }
}
