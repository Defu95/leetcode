public class Reverse_Linked_List {
    public static void main(String[] args){
        int[] arr={1,2,3};
        ListNode head=Sort_List.createLinkedList(arr,arr.length);
        ListNode res=reverseList(head);
//        ListNode res=cut(head);
//        res.val=res.next.val;
        while (res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
//        ListNode newHead = reverseList(head.next);
//        int n=newHead.val;
//        // reverse between head and head->next
//        head.next.next = head;
//        int m=head.val;
//        // unlink list from the rest
//        head.next = null;
//        return newHead;
        else{
            ListNode pre=null,cur=head;
            while(cur!=null){
                ListNode tmp=cur.next;
                cur.next=pre;
                pre=cur;
                cur=tmp;
            }
            ListNode res=pre;
            return res;
        }

    }
    public static ListNode cut(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode p=new ListNode(head.next.val),tmp=p;
        head=head.next;
        while(head.next.next!=null) {
            head = head.next;
            tmp.next=new ListNode(head.val);
            tmp=tmp.next;
        }
        return p;
    }
}
