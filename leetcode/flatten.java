package leetcode101;


public class flatten {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
public void flatten(TreeNode root) {


		
		if( root == null)
			return ;
		else if( root.left == null )
			flatten(root.right);
		else{
			TreeNode node = root.right;
			TreeNode node2 = getRight(root.left);
			root.right = root.left;
			root.left = null;
			node2.right = node;
			flatten(root.right);
		}

    

    }
    public TreeNode getRight(TreeNode root ){
    	while( root.right != null)
    		root = root.right;

    	return root;
    }
}
