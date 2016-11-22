package leetcode;

import leetcode.test.ListNode;

public class mergeTwoLists {
//	public class ListNode {
//	      int val;
//	      ListNode next;
//	      ListNode(int x) { val = x; }
//	  }
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		
		if( l1 == null)
			return l2;
		if( l2 == null)
			return l1;
		ListNode result,listnode;
		if(l1.val > l2.val){
			result = l2;
			l2 = l2.next;
		}
		else{
			result = l1;
			l1 =l1.next;
		}
		listnode = result;
		while(l1 != null && l2 != null){
			if(l1.val>l2.val){
				listnode.next = l2;
				listnode = l2;
				l2 = l2.next;
			}else{
				listnode.next = l1;
				listnode = l1;
				l1 = l1.next;
			}
		}
		if( l1 == null)
			listnode.next = l2;
		else
			listnode.next = l1;
		return result;
        
    }
	/*
	 * 1.合并两个链表
	 * 2，11+89没啥说的
	 */
}
