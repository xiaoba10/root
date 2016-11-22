package leetcode101;

import java.util.ArrayList;
import java.util.List;


public class sortedListToBST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){ val = x;}
		
	}
public TreeNode sortedListToBST(ListNode head) {
	List list = new ArrayList<Integer>();
    if( head == null)
    	return null;
    return helper(head,null);
}
public TreeNode helper(ListNode head,ListNode target){

	if( head == target )
		return null;
	ListNode node1 = head;
	ListNode node2 = head;

	while( node2 != target && node2.next != target){
		node1 = node1.next;
		node2 = node2.next.next;
	}
	TreeNode node = new TreeNode(node1.val);

	node.left = helper(head,node1);
	node.right = helper(node1.next,target);

	return node;

    }
    




    
}
