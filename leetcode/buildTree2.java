package leetcode101;

import leetcode101.buildTree.TreeNode;

public class buildTree2 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        	


        int len = inorder.length;
        if( len == 0)
        	return null;

        return helper(inorder,0,len-1,postorder,len-1);

    }

    public TreeNode helper(int[] inorder,int start,int end, int[] postorder, int pos ){

    	if( pos < 0 || start >= end)
    		return null;

    	TreeNode node = new TreeNode(postorder[pos]);

    	int size = 0;
    	for( int i = start;i<=end && inorder[i] != postorder[pos];i++,size++)
    		;

    	node.left = helper(inorder,start,start+size-1,postorder,pos-size-1);

    	node.right = helper(inorder,start+size+1,end,postorder,pos-1);

    	return node;

    }
}
