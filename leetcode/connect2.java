package leetcode101;

import java.util.LinkedList;
import java.util.Queue;

public class connect2 {

	public class TreeLinkNode {
		      int val;
		      TreeLinkNode left, right, next;
		      TreeLinkNode(int x) { val = x; }
		  }
	public void connect(TreeLinkNode root) {

		

		if( root == null )
			return ;
		TreeLinkNode low = null;//指的是下面一行的第一个结点
		TreeLinkNode up = root;
		if( root.left != null )
			low = root.left;
		else if( root.right != null )
			low = root.right;
		while( low != null ){
			TreeLinkNode start = low;
			TreeLinkNode upStart = up;
			helper(start,upStart);
			while( low != null ){
				if( low.left != null ){
					TreeLinkNode node = low.left;
					up = low;
					low = node;
					break;
				}
				if( low.right != null ){
					TreeLinkNode node = low.right;
					up = low;
					low = node;
					break;
				}
				low = low.next;
			}

		}
    }

    public void helper(TreeLinkNode start,TreeLinkNode upStart){

    	if( upStart.left != null){
    		if( upStart.right != null){
    			start.next = upStart.right;
    			start = start.next;
    		}
    	}
    	upStart = upStart.next;
    	while( upStart != null ){

    		if( upStart.left != null  ){
    			start.next = upStart.left;
    			start = start.next;
    			if( upStart.right != null ){
    				start.next = upStart.right;
    				start = start.next;
    			}
    		}else if( upStart.right != null ){
    			start.next = upStart.right;
    			start = start.next;
    		}
    		upStart = upStart.next;
    	}


    }

}
