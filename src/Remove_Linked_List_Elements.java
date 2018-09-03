public class Remove_Linked_List_Elements {
    public static void main(String[] args){
        int[] arr={1,2,6,3,4,5,6};
//        int[] arr={1,1};
        ListNode test=Sort_List.createLinkedList(arr,arr.length);
        ListNode res=removeElements(test,6);
        while (res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        ListNode res=new ListNode(0),cur=res;
//        while (head!=null){
//            if(head.val==val){
//                head=head.next;
//            }else{
//                res.next=new ListNode(head.val);
//                res=res.next;
//                head=head.next;
//            }
//        }
//        return cur.next;
        ListNode r=head;
        while (head.val==val){
            ListNode tmp=head.next;
            head.next=null;
            head=tmp;
        }
        while (head.next!=null){
            if(head.next.val==val){
                head.next=head.next.next;
            }else{
                head=head.next;
            }
        }
        return r;
    }
}
