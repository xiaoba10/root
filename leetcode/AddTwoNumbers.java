package leetcode;


public class AddTwoNumbers {
	public class ListNode {
	      int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	 
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode mid2 = new ListNode(0);
        int num = 0;
		if(l1 == null )
		    return l2;
		else if(l2 == null )
		    return l1;
		result.val = l1.val + l2.val;
		if(result.val > 9){
		    result.val -= 10;
		    num = 1;
		}
		mid2 = result;
		l1 = l1.next;
		l2 = l2.next;
		while(l1 != null && l2 != null){
		    int num1 = l1.val + l2.val + num;
		    ListNode mid = new ListNode(0);
		    if( num1 < 10){
		        mid.val = num1;
		        num = 0;
		    }
		    else {
		        mid.val = num1 - 10;
		        num = 1;
		    }
		    mid2.next = mid;
		    l1 = l1.next;
		    l2 = l2.next;
		    mid2 = mid;
		}
		ListNode node = new ListNode(0);
		if(l1 == null)
		    node = l2;
		else 
		    node = l1;
		if(num == 0)
		    mid2.next = node;
		else{
		    while(node != null){
		        ListNode node1 = new ListNode(0);
		        if(node.val + num <10){
		            node1.val = node.val + num;
		            mid2.next = node1;
		            node1.next = node.next;
		            num = 0;
		            break;
		        }
		        else{
		            node1.val = node.val + num -10;
		            mid2.next = node1;
		            mid2 = node1;
		            node = node.next;
		        }
		    }
		}
		if(num == 1){
		    ListNode last = new ListNode(1);
		    mid2.next = last;
		}
		return result;
    }
}

/*
 * 1.第二题，将两个链表相加，并且有进位
 * 2.注意的细节比较多。尤其是进位
 * 
 * 
 */
