package leetcode101;

import leetcode101.buildTree2.TreeNode;

public class isBalanced {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
public boolean isBalanced(TreeNode root) {
        
        if( root == null)
        	return true;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if( left - right > 1 || right - left > 1)
        	return false;
        return isBalanced(root.left)&&isBalanced(root.right);

		
	
    }

    public int maxDepth(TreeNode root) {


		if( root == null )
			return 0;
		if( root.left == null && root.right == null)
			return 1;
		if( root.left == null)
			return maxDepth(root.right)+1;
		if( root.right == null)
			return maxDepth(root.left)+1;
		return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
