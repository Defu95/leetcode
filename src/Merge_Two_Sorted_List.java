class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

public class Merge_Two_Sorted_List {
    public static void main(String[] args){
        ListNode n1 = new ListNode(3);
        n1.next = new ListNode(5);
        ListNode n2 = new ListNode(2);
        n2.next = new ListNode(4);
//        n2.next = n1;
//        while(n2!=null){
//        System.out.print(n2.val);
//        n2=n2.next;}
        ListNode res=mergeTwoLists(n1,n2);
        while(res!=null){
            System.out.print(res.val+", ");
            res = res.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(-1), cur=l3;
        if(l1==null)
            return l2;
        else{
            if(l2==null)
                return l1;
            else{
                while(l1!=null&&l2!=null){
                    if(l1.val>=l2.val){
                        cur.next=l2;
                        l2=l2.next;
                    } else{
                        cur.next=l1;
                        l1=l1.next;
                    }
                    cur=cur.next;
                }
                  cur.next=(l1!=null)? l1:l2;
            }
        }
        return l3.next;
//        ListNode dummy = new ListNode(-1), cur = dummy;
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                cur.next = l1;
//                l1 = l1.next;
//            } else {
//                cur.next = l2;
//                l2 = l2.next;
//            }
//            cur = cur.next;
//        }
//        cur.next = (l1 != null) ? l1 : l2;
//        return dummy.next;
    }
}
