//package Package126;
//
///**
// * Created by wangzunwen on 2016/11/16.
// */
//public class sortList {
//
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode(int x) { val = x; }
//     * }
//     */
//
//
//    public ListNode sortList(ListNode head) {
//
//
//        if( head == null || head.next == null)
//            return head;
//
//        int size = 1;
//        ListNode start = new ListNode(0);
//        start.next = head;
//
//        while( true ){
//            ListNode node1 = start;
//            ListNode node2 = start.next;
//            for( int i = 0 ; i < size && node2!=null;i++){
//                node2 = node2.next;
//            }
//
//            if( node2 == null )
//                break;
//            ListNode nnn = start.next;
//
//            while( node2 != null ){
//                node1 = helper(node1,node2,size);
//                if( node1 == null  )
//                    break;
//                node2 = node1.next;
//                for( int i = 0 ; i< size && node2 != null;i++){
//                    node2 = node2.next;
//                }
//            }
//            size*=2;
//        }
//        return start.next;
//
//
//    }
//
//    public ListNode helper(ListNode node1,ListNode node2,int size){
//
//
//
//
//
//        int num1 = 0,num2 = 0;
//
//        ListNode node = null;
//
//
//        if( node1.next.val < node2.val ){
//            node = node1.next;
//            node1 = node1.next.next;
//            num1++;
//        }else{
//            ListNode nn = node1.next;
//            node1.next = node2;
//            node1 = nn;
//            node = node2;
//            node2 = node2.next;
//            num2++;
//        }
//
//        while( num1 < size && num2 < size && node1 != null && node2 != null){
//
//
//            if( node1.val < node2.val ){
//                node.next = node1;
//                node = node1;
//                node1 = node1.next;
//                num1++;
//            }else{
//                node.next = node2;
//                node = node2;
//                node2 = node2.next;
//                num2++;
//            }
//        }
//        while( num1 < size && node1 != null){
//            node.next = node1;
//            node = node1;
//            node1 = node1.next;
//            num1++;
//        }
//
//        while( num2 < size && node2 != null){
//            node.next = node2;
//            node = node2;
//            node2 = node2.next;
//            num2++;
//        }
//        node.next = node2;
//        return node;
//
//
//    }
//
//}
