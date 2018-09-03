public class Middle_of_the_Linked_List {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        ListNode head=Sort_List.createLinkedList(arr,arr.length);
        ListNode res=middleNode(head);
        while (res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
    public static ListNode middleNode(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode slow=head,fast=head.next,p=head;
        int count=0;
        while (p!=null){
            count++;
            p=p.next;
        }
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(count%2==0)
            return slow.next;
        else return slow;
    }
}
