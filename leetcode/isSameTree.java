package leetcode62;


public class isSameTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
public boolean isSameTree(TreeNode p, TreeNode q) {
        
        
        return getResult(p,q);
    }
    public boolean getResult(TreeNode p,TreeNode q){
    	if( p == null && q == null )
        	return true;
        else if( p == null || q == null)
        	return false;

    	if( p.val != q.val)
    		return false;

    	return getResult(p.left,q.left)&&getResult(p.right,q.right);


    }

}
