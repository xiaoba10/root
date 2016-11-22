package leetcode;
import leetcode.test.ListNode;



public class swapPairs {
	public ListNode swapPairs(ListNode head) {
		
		ListNode result = new ListNode(0);
		ListNode list = result, list2 = null;
		while(head != null && head.next != null ){
			list2 = head.next.next;
			System.out.println(head.val);
			list.next = head.next;
			list.next.next = head;
			list = list.next.next;
			head = list2;
			
		}
		
		if(head != null && head.next == null)
			list.next = head;
        return result.next;
    }
	/*
	 * 1.交换每两个链表中的数
	 * 2.很简单，87+13；
	 */
}
