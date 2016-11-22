//package Package126;
//
//import java.util.ArrayList;
//import java.util.Deque;
//import java.util.List;
//
///**
// * Created by wangzunwen on 2016/11/16.
// */
//public class preorderTraversal {
//
//    /**
//     * Definition for a binary tree node.
//     * public class TreeNode {
//     *     int val;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode(int x) { val = x; }
//     * }
//     */
//    public List<Integer> preorderTraversal(TreeNode root) {
//
//
//        Deque<TreeNode> queue = new LinkedDeque<TreeNode>();
//
//        List list = new ArrayList<Integer>();
//
//        if( root == null )
//            return list;
//
//        queue.add(root);
//
//        while( !queue.isEmpty() ){
//
//            TreeNode node = queue.poll();
//            list.add(node.val);
//
//            if( node.right != null )
//                queue.addFirst(node.right);
//            if( node.left != null )
//                queue.addFirst(node.left);
//
//
//        }
//
//
//        return list;
//
//
//
//
//    }
//}
