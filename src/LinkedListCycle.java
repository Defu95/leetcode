import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class LinkedListCycle {
    public static void main(String[] args){
        LinkedList<String> linkedlist=new LinkedList<String>();
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        System.out.print(linkedlist);
//        boolean res=hasCycle(linkedlist);
//        System.out.print(res);

    }
//    public static boolean hasCycle(ListNode head) {
//    if(head==null || head.next==null){
//        return false;}
//    ListNode slow=head;
//    ListNode fast=head.next;
//    while(slow!=fast){
//        if(fast==null||fast.next==null){
//            return false;}
//        slow=slow.next;
//        fast=fast.next.next;
//    }
//    return true;
//    }
}
