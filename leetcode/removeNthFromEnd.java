package leetcode;

public class removeNthFromEnd {
	
	
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int i = 0;
		if(head == null || n == 0)
			return head;
		if( head.next == null )
			return null;
		ListNode before = head,after = head.next.next , result = head;
		if ( n == 1)
			after = null;
		while(head.next!=null){
			if( i<n ){
				head = head.next;
				i++;
			}else {
				before = before.next;
				if( n!= 1)
					after = after.next;
				head = head.next;
			}
		}
		
		if( i == n-1)
			return result.next;
		else{
			before.next = after;
			return result;
		}
        
    }
	/*
	 * 1.ɾ�������еĵ�����n�������ܼ򵥣����Ǳ߽�������Ҫ�ж������7+92
	 */

}
