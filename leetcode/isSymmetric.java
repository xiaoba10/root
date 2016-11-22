package leetcode101;


public class isSymmetric {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
public boolean isSymmetric(TreeNode root) {

	if( root == null )
		return true;
	if( root.left == null && root.right == null)
		return true;
	if( root.left == null || root.right == null)
		return false;

	return getResult(root.left,root.right);
        
    }

    public boolean getResult(TreeNode left,TreeNode right){
    	if( left == null && right == null)
    		return true;
    	if( left == null || right == null)
    		return false;
    	if( left.val != right.val )
    		return false;
    	return getResult(left.left,right.right)&&getResult(left.right,right.left);

    }

}
