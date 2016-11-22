package Package126;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by wangzunwen on 2016/11/15.
 */
public class reorderList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public void reorderList(ListNode head) {

        
        
        
        
        
        
        if( head == null || head.next == null || head.next.next == null )
            return ;
        ListNode slow = head;
        ListNode fast = head.next;
        while( fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode node2 = slow;
        fast = slow.next;
        
        while( fast != null ){
            

            ListNode node = fast.next;
            fast.next = slow;
            slow = fast;
            fast = node;
            

        }
        node2.next = null;
        node2 = slow;
        ListNode node1 = head;
        
        while( node1 != null   ){
            ListNode node = node1.next;
            ListNode nn = node2.next;
            node1.next = node2;
            node2.next = node;
            node1 = node;
            node2 = nn;
        }
        
        

        return ;
    
    



    }

}
