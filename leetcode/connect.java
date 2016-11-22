package leetcode101;

import java.util.LinkedList;
import java.util.Queue;

import leetcode101.buildTree2.TreeNode;

public class connect {
	
	public class TreeLinkNode {
		      int val;
		      TreeLinkNode left, right, next;
		      TreeLinkNode(int x) { val = x; }
		  }
public void connect(TreeLinkNode root) {

		if( root == null)
			return ;
		

		TreeLinkNode node1 = root,node2 = root;
		while( node1.left != null ){

			node1 = node2.left;
			while( node2.next != null ){
				node2.left.next = node2.right;
				node2.right.next = node2.next;
				node2 = node2.next;
			}
			node2.left.next = node2.right;
			node2 = node1;


		}

        
    }
}
