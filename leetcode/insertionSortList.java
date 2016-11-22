//package Package126;
//
///**
// * Created by wangzunwen on 2016/11/16.
// */
//public class insertionSortList {
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode(int x) { val = x; }
//     * }
//     */
//    public ListNode insertionSortList(ListNode head) {
//
//        ListNode node = head.next;
//        ListNode start = head;
//
//        while( node != null ){
//            ListNode nn = node.next;
//            ListNode first = start;
//            if( node.val < first.val){
//                node.next = first;
//                start = node;
//            }else{
//                while( first.next != null && first.next.val < node.val )
//                    first = first.next;
//                node.next = first.next;
//                first.next = node;
//
//            }
//
//            node = nn;
//
//        }
//        return start;
//    }
//
//
//}
