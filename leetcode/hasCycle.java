package Package126;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangzunwen on 2016/11/15.
 */
public class hasCycle {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public boolean hasCycle(ListNode head) {

    	if( head == null || head.next == null )
    		return false;
    	ListNode fast = head.next;
    	ListNode slow = head;

    	while( fast.next != null && fast.next.next != null ){
    		slow = slow.next;
    		fast = fast.next.next;
    		if( fast == slow )
    			return true;
    	}

    	return false;
    }
}
