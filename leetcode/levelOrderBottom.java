package leetcode101;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode101.buildTree2.TreeNode;

public class levelOrderBottom {
	
	public class buildTree2 {
		public class TreeNode {
			int val;
			TreeNode left;
			TreeNode right;

			TreeNode(int x) {
				val = x;
			}
		}
	}
public List<List<Integer>> levelOrderBottom(TreeNode root) {
	

List list = new ArrayList<List<Integer>>();

if( root == null)
	return list;

Queue<TreeNode> tree = new LinkedList<TreeNode>();


tree.add(root);
while( !tree.isEmpty() ){
	List ans = new ArrayList<Integer>();
	int size = tree.size();
	for( int i = 0;i<size;i++){
		TreeNode node = tree.poll();
		ans.add(node.val);
		if( node.left != null )
			tree.add(node.left);
		if( node.right != null)
		    tree.add(node.right);
	}
	if( !ans.isEmpty() )
		list.add(0,ans);



}



return list;


}
}
