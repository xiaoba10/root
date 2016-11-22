package leetcode101;


public class maxPathSum {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	public int maxPathSum(TreeNode root) {

		if( root == null)
			return 0;
		long result[] = helper(root);
		

        return (int)Math.max(result[0], result[1]);
    }

    public long[] helper(TreeNode node){
    	long[] result = new long[2];
        result[0] = Integer.MIN_VALUE;
    	result[1] = Integer.MIN_VALUE;
    	if( node == null )
    		return result;
    	result[0] = node.val;
    	result[1] = node.val;
    	if( node.left == null && node.right == null)
    		return result;

    	long[] num1 = helper(node.left);
    	long[] num2 = helper(node.right);

    	result[0] = Math.max(Math.max(num1[0],num2[0])+node.val,node.val);
    	result[1] = Math.max(Math.max(Math.max(Math.max(Math.max(num1[1],num2[1]),num1[0]+num2[0]+node.val),num1[0]+node.val),
    	            num2[0]+node.val),node.val);

    	return result;

    }
}
