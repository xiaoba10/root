package leetcode62;

public class deleteDuplicates {
	
	
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
 }
	
	
	
	public ListNode deleteDuplicates(ListNode head) {
        
        if( head == null || head.next == null)
        	return head;
        ListNode result = head;
        ListNode first = head;
        ListNode flag ;
        int DD = 0;
        if( head.val == head.next.val )
        	DD = 1;
        int del = 0;
        while( first.next != null){
        	flag = first.next;
        	if( first.val == flag.val){
        		del = 1;
        	}else{
        		if( del == 0 && !head.equals(first) ){
        			result.next = first;
        			result = result.next;
        		}
        		del = 0;
        	}
        	first = first.next;
        }
        if( del == 0){
        	result.next = first;
        	result = result.next;
        }
        result.next = null;
        if( DD == 1 )
        	return head.next;
        else
        	return head;

    }
}
