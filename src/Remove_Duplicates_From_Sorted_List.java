public class Remove_Duplicates_From_Sorted_List {
    public static void main(String[] args){
        int[] arr={1,1,2,3,3};
        ListNode test=Sort_List.createLinkedList(arr,arr.length);
        ListNode res=deleteDuplicates(test);
        while(res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
            return head;
//        ListNode cur=new ListNode(head.val),res=cur;
//        while(head!=null){
//            if(cur.val<head.val){
//                cur.next=new ListNode(head.val);
//                cur=cur.next;
//                head=head.next;
//            }else {
//                head = head.next;
//            }
//        }
//        return res;
        ListNode p=head;
        while(head.next!=null){
            if(head.val!=head.next.val){
                head=head.next;
            }else{
                head.next=head.next.next;
            }
        }
        return p;
    }
}
