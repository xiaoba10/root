package leetcode101;

import java.util.ArrayList;
import java.util.List;

import leetcode101.buildTree2.TreeNode;

public class pathSum {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	List list = new ArrayList<List<Integer>>();
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        if( root == null)
        	return list;
        getResult(root,sum,new ArrayList<Integer>());
        return list;
    }

    public void getResult(TreeNode root,int sum,List<Integer> ans){

    	ans.add(root.val);

    	if( root == null )
    		return ;
    	if( sum == 0 ){
    		if( root.left == null && root.right == null){
    			ArrayList result = new ArrayList<Integer>();
    			result.addAll(ans);
    			list.add(result);
    		}
    	}
    	ans.add(root.val);
    	getResult(root.left,sum-root.val,ans);
    	ans.remove(root.val);
    	return ;

    }
}
