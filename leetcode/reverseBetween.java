package leetcode62;

import leetcode62.deleteDuplicates.ListNode;

public class reverseBetween {
	
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
}
public ListNode reverseBetween(ListNode head, int m, int n) {
	if( head == null || head.next == null || m==n)
		return head;
	ListNode bef = head;
	for( int i = 2;i<m;i++)
		bef = bef.next;
	ListNode start = null;
	if( m < 2){
		bef = null;
		start = head;
	}else
		start = bef.next;
	ListNode SS = start;
	ListNode flag = null;
	ListNode next = start.next;
	for( int i = 0;i<n-m;i++){
		next = start.next;
		start.next = flag;
		flag = start;
		start = next;
	}
	ListNode end = start.next;
	start.next = flag;
	if( end == null && bef == null)
	    return start;
	else if( end == null){
		bef.next = start;
		return head;
	}else if( bef == null){
		SS.next = end;
		return start;
	}else {
		bef.next = start;
		SS.next = end;
		return head;
	}

    }
}
