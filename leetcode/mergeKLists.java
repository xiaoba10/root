package leetcode;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import leetcode.test.ListNode;


public class mergeKLists {
	
	public ListNode mergeKLists(ListNode[] lists) {
		ListNode result = null, list1 = null,list2 = null;
		if( lists.length == 0)
			return result;
        Comparator<ListNode> Com = new Comparator<ListNode>(){
			public int compare(ListNode list1,ListNode list2){
				int num1 = list1.val;
				int num2 = list2.val;
				if(num1>num2)
					return 1;
				else if(num1<num2)
					return -1;
				else 
				    return 0;
			}
		};
		Queue<ListNode> ans = new PriorityQueue<ListNode>(lists.length,Com);
		for( ListNode list:lists){
		    if( list!=null)
			    ans.add(list);
		}
		result = ans.peek();
		if( result == null)
			return result;
		list1 = result;
		list2 = ans.peek();
		ans.poll();
 		if(list2.next != null)
 			ans.add(list2.next);		
		while(!ans.isEmpty()){
			list1.next = ans.peek();
			list2 = ans.peek();
			list1 = list1.next;
			ans.poll();
			if(list2.next!=null)
				ans.add(list2.next);
		}
			
		return result;
	
		
		
		}
		
		
		
//		ListNode result = null, list = null, list1 = null;
//		int pos = -1;
//		if( lists.length == 0)
//			return result;
//		for( int i=0; i<lists.length; i++){
//			if( lists[i]!= null && pos == -1){
//					list = lists[i];
//					pos = i ;
//				}else if( lists[i]!= null && lists[i].val<list.val){
//				    pos = i;
//				    list = lists[i];
//				}
//		}
//		if( pos == -1)
//			return result;
//		result = lists[pos];
//		list1 = result;
//		lists[pos] = lists[pos].next;
//		while(true){
//			pos = -1;
//			for( int i=0; i<lists.length; i++){
//				if( lists[i]!= null && pos == -1){
//					list = lists[i];
//					pos = i ;
//				}else if(lists[i]!= null && lists[i].val<list.val){
//				    pos = i;
//				    list = lists[i];
//				}
//			}
//			if( pos == -1)
//				break;
//			lists[pos] = lists[pos].next;
//			list1.next = list;
//			list1 = list;
//			
//		}
//        return result;
//   }
	/*
	 * 1.��n������ϲ���Ľ��
	 * 2.��һ��ֱ�ӱȽϺϲ��������ʱ��
	 * 3.40+11���˶�����
	 * ��΢�Ľ�֮����49+11
	 */
		
}
