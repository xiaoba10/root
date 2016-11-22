package leetcode62;

import leetcode62.deleteDuplicates.ListNode;

public class deleteDuplicates_easy {
	
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
	}
	
	
	public ListNode deleteDuplicates(ListNode head) {
        if( head == null || head.next == null)
        	return head;
        ListNode result = head.next;
        ListNode flag = head;
        ListNode flag_next ;
        while( flag.next != null){
        	flag_next = flag.next;
        	if( flag.val != flag_next.val ){
        		result.next = flag;
        		result = result.next;
        	}
        	flag = flag_next;
        }
        return head;
    }
}
