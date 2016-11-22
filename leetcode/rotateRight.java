package leetcode;

public class rotateRight {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode rotateRight(ListNode head, int k) {
        if( k == 0 || head == null || head.next == null){
            return head;
        }
		ListNode flag = head;
		for( int len = 1 ; len<= k ; len++){
			flag = flag.next;
			if( flag == null){
				flag = head;
				k = k%len;
				len = 0;
			}
		}
		ListNode result = head;
		while( flag.next != null){
			result = result.next;
			flag = flag.next;
		}
		ListNode newnode = result.next;
		flag.next = head;
		result.next = null;
		return newnode;
    }
}
