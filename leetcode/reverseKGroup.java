package leetcode;

import leetcode.test.ListNode;

public class reverseKGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
        ListNode begin = new ListNode(0), end = null;
        ListNode[] ans = new ListNode[2];
        if( head == null)
        	return begin.next;
        if( k == 1 || k == 0)
            return head;
        end = head;
        ans = reverseK(head,k);
        begin.next = ans[0];
        head = ans[1];
        while( head!=null ){
        	ans = reverseK(head,k);
        	end.next = ans[0];
        	end = head;
        	head = ans[1];

        }
        return begin.next;
        
    }
	public ListNode[] reverseK(ListNode head,int k){//result[0]����֮��ĵ�һ���ڵ㣬result[1]��һ��Ŀ�ͷ�ڵ�
		ListNode list = null;
		ListNode[] result = new ListNode[2];
		result[0] = head;
		int j = 1;
		
		while(k>1 && head.next != null){
		    if( result[1] == null && j == 1){
			    list = head.next;
			    result[1] = list.next;
		    	list.next = head;
			    head = list;
		    }
		    else if(result[1] == null ){
		        result[0].next = null;
		        result[1] = list;
			    System.out.println(result[1].val+" "+j);
			    return reverseK(result[1],j);
		    }
			else{
			    if(result[1].next == null && k != 2){
			        result[0].next = null;
			        result[1].next = head;
			        System.out.println(j);
			        return reverseK(result[1],j+1);
			    }
			    list = result[1].next;
			    result[1].next = head;
			    head = result[1];
			    result[1] = list;
			}
			k--;
			j++;
		}
		result[0].next = null;
		result[0] = head;
		if( k!= 1)
		    result[1] = null;
		return result;
	}
	/*
	 * 1.��һ�������n���ڵ㵹��Ҫ��ֻ���ó������ռ�
	 * 2.��һ�Σ�5+1���ã����Ҳ����ܶ�
	 * 3.��΢�޸�֮��6+27
	 * public ListNode reverseKGroup(ListNode head, int k) {
        ListNode begin = new ListNode(0), end = null, num1 = null;
        ListNode[] ans = new ListNode[2];
        int num = 0;
        num1 = head;
        while(num1!=null && k>num){
            num++;
            num1 = num1.next;
        }
        if(num!=k || k == 1)
            return head; 
        end = head;
        ans = reverseK(head,k);
        begin.next = ans[0];
        head = ans[1];
        while( head!=null ){
            num = 0;
            while(num1!=null && k>num){
                num++;
                num1 = num1.next;
            }
            if(num!=k ){
                end.next = head;
                return begin.next;
            }
        	ans = reverseK(head,k);
        	end.next = ans[0];
        	end = head;
        	head = ans[1];
        }
        return begin.next;
    }
	public ListNode[] reverseK(ListNode head,int k){//result[0]����֮��ĵ�һ���ڵ㣬result[1]��һ��Ŀ�ͷ�ڵ�
		ListNode list = null;
		ListNode[] result = new ListNode[2];
		result[0] = head;
		while(k>1 && head.next != null){
		    if( result[1] == null ){
			    list = head.next;
			    result[1] = list.next;
		    	list.next = head;
			    head = list;
		    }
			else{
			    list = result[1].next;
			    result[1].next = head;
			    head = result[1];
			    result[1] = list;
			}
			k--;
		}
		result[0].next = null;
		result[0] = head;
		return result;
	}
	 */
}
