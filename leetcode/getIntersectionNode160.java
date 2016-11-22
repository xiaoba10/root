package leetcode152;

/**
 * Created by wangzunwen on 2016/11/19.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class getIntersectionNode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    	int len1 = 1,len2 = 1;
    	ListNode node1 = headA;
    	ListNode node2 = headB;
    	while( node1.next != null ){
    		node1 = node1.next;
    		len1++;
    	}
    	while( node2.next != null ){
    		node2 = node2.next;
    		len2++;
    	}
    	if( len1 == 0 || len2 == 0 || node1 != node2 )
    		return null;
    	node1 = headA;
    	node2 = headB;
    	if( len1 > len2 ){
    		while( len1 > len2 ){
    			len1--;
    			node1 = node1.next;
    		}
    	}else if( len1 < len2 ){
    		while( len1<len2){
    			len2--;
    			node2 = node2.next;
    		}
    	}

    	while( len1 >0 ){
    		if( node1 == node2 )
    			return node1;
    		node1 = node1.next;
    		node2 = node2.next;
    		len1--;
    	}
    	return null;

    }
}
