//package Package126;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
///**
// * Created by wangzunwen on 2016/11/16.
// */
//public class postorderTraversal {
//    public List<Integer> postorderTraversal(TreeNode root) {
//
//
//    	List list = new ArrayList<Integer>();
//
//        if( root == null )
//        	return list;
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//
//    	stack.push(root);
//
//    	while( !stack.isEmpty() ){
//
//    		TreeNode node = stack.pop();
//    		list.add(0,node.val);
//    		if( node.right != null )
//    			stack.push(node.right);
//    		if( node.left != null )
//    			stack.push(node.left);
//
//    	}
//    	return list;
//
//
//    }
//}
