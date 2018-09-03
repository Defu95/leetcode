public class IntersectionofTwo_Linked_Lists {
    public static void main(String[] args){
        int[] a1={3,4,6,8,6};
        int[] a2={3,2,6};
        ListNode A=Sort_List.createLinkedList(a1,a1.length);
        ListNode B=Sort_List.createLinkedList(a2,a2.length);
        ListNode res=getIntersectionNode(A,B);
        while(res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
            return null;
        ListNode a=headA,b=headB,tA=null;
        while (a!=null&&b!=null){
            a=a.next;
            b=b.next;
        }
        int i=0,f1=-1,flag=-1;
        if(a==null){
            while (b!=null){
                i++;
                b=b.next;
            }
        }else{
            f1=1;
            while(a!=null){
                i++;
                a=a.next;
            }
        }
        if(f1==-1){
            for(int j=i;j>0;j--)
                headB=headB.next;
        }else {
            for(int j=i;j>0;j--)
                headA=headA.next;
        }
        while(headA!=null){
            if(headA.val!=headB.val){
                headA= headA.next;
                headB= headB.next;
                flag=-1;
            }else{
                if (flag == -1) {
                    tA=headA;
                    flag=1;
                    headA=headA.next;
                    headB=headB.next;
                }else{
                headA=headA.next;
                headB=headB.next;}
            }
        }
        if(flag==1)
            return tA;
        else return null;
    }
}
