//this function can be run in leetcode ,but here we don't use cycle linked list to test this module.
public class Linked_List_Cycle_II {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,1};
        ListNode cycle=Sort_List.createLinkedList(arr,arr.length);
        ListNode res=detectCycle(cycle);
        System.out.println(res);
    }

    public static ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null)
            return null;
        ListNode p=head,q=head,r=head,slow=head,fast=head.next;
        if(iscycle(head)){
            int i=1;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next.next;
            }
            slow=slow.next;
            while(slow!=fast){
                slow=slow.next;
                i++;
            }
            for(int n=0;n<i;n++)
                q=q.next;
            while(r!=q){
                r=r.next;
                q=q.next;
            }
            return r;

        }else{
            return null;
        }

    }

    public static boolean iscycle(ListNode head){
        ListNode slow=head,fast=head.next;
        while(fast!=null&&fast.next!=null){
            if(slow==fast)
                return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}
