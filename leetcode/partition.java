package leetcode62;

import leetcode62.deleteDuplicates.ListNode;

public class partition {
	
	
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
}
	
public ListNode partition(ListNode head, int x) {
    if( head == null || head.next == null)
        return head;
    ListNode List1 = new ListNode(0);
    ListNode List2 = new ListNode(0);
    ListNode result = List1;
    ListNode ll = List2;
    ListNode flag = head;
    while( flag != null){
    	if( flag.val < x){
    		List1.next = flag;
    		List1 = List1.next;
    	}else{
    		List2.next = flag;
    		List2 = List2.next;
    	}
    	flag = flag.next;
    }
    List2.next = null;
    List1.next = ll.next;
    return result.next;
    
}
}
