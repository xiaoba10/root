package Package126;

import java.util.List;

/**
 * Created by wangzunwen on 2016/11/15.
 */
public class detectCycle {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {

        if( head == null || head.next == null )
            return null;
        ListNode fast = head;
        ListNode slow = head;

        while( fast != null && fast.next != null  ){
            slow = slow.next;
            fast = fast.next.next;
            if( fast == slow ){
                ListNode find = head;
                while( find != slow ){
                    find = find.next;
                    slow = slow.next;
                }
                return find;
            }
        }

        return null;




    }
}
