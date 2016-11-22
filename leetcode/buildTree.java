package leetcode101;


public class buildTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	public TreeNode buildTree(int[] preorder, int[] inorder) {

		int len = preorder.length;
		if( len == 0)
			return null;
		return helper(preorder,0,len-1,inorder,0,len-1);

		
    }



    public TreeNode helper( int[] preorder,int pre_start,int pre_end,int[] inorder,int in_start,int in_end){

    	

    	TreeNode node = new TreeNode(preorder[pre_start]);


    	int size = 0;
    	for( int i = in_start;i<=in_end && inorder[i] != preorder[pre_start];i++,size++)
    		;

    	node.left = helper(preorder,pre_start+1,pre_start+size,inorder,in_start,in_start+size);

    	node.right = helper(preorder,pre_start+size+1,pre_end,inorder,in_start+size+1,in_end);

    	return node;




    }
    



}
