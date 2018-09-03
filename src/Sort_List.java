import java.util.List;

public class Sort_List {
    public static void main(String[] args){
        int[] arr ={1,3,6,5,7};
        int n = arr.length;
        ListNode n1=createLinkedList(arr,n);
        ListNode res=sortList(n1);
        while(res!=null){
            System.out.print(res.val+", ");
            res = res.next;
        }
    }


    public static ListNode createLinkedList(int arr[], int n){
        if( n == 0 ) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curNode = head;
        for(int i = 1; i < n; i++){
            curNode.next = new ListNode(arr[i]);
            curNode = curNode.next;
        }
        return head;
    }

    public static ListNode retmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = retmid(head);
        ListNode right = sortList(mid.next);
        mid.next =null;
        ListNode left = sortList(head);

        return Merge_Two_Sorted_List.mergeTwoLists(left, right);
    }
}
