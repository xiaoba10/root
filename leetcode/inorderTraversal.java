package leetcode62;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;




public class inorderTraversal {
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	     TreeNode right;
	      TreeNode(int x) { val = x; }
}
	

    
    List result = new ArrayList<Integer>();
	public List<Integer> inorderTraversal(TreeNode root) {
		if( root == null)
			return result;
		Stack stack = new Stack<TreeNode>();
		TreeNode node = root;
		while( true ){
			if( node.left == null){
				result.add(node.val);
				if( node.right == null ){
					if( stack.isEmpty() )
						break;
					else
						node = (TreeNode) stack.pop();
				}else{
					node = node.right;
				}
				
			}else{
			    TreeNode flag = node;
			    node = node.left;
			    flag.left = null;
				stack.push(flag);
				
			}
		}


		return result;        
    }
    


    
}	
