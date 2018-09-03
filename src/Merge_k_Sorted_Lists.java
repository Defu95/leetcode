public class Merge_k_Sorted_Lists{
    public static void main(String[] args){
        int[] arr1={1,4,5};
        int[] arr2={1,3,4};
        int[] arr3={2,6};
        int[] arr4={};
        ListNode l1=Sort_List.createLinkedList(arr1,3);
        ListNode l2=Sort_List.createLinkedList(arr2,3);
        ListNode l3=Sort_List.createLinkedList(arr3,2);
        ListNode l4=Sort_List.createLinkedList(arr4,0);
        ListNode[] lists={l1,l4,l2};
        ListNode res=mergeKLists(lists);
        while(res!=null){
            System.out.print(res.val+", ");
            res = res.next;
        }

    }
    public static ListNode mergeKLists(ListNode[] lists) {
        int k=lists.length;
        if(k==0)
            return null;
        if(k==1)
            return lists[0];
        if(k==2)
            return Merge_Two_Sorted_List.mergeTwoLists(lists[0],lists[1]);
        int flag=-1;
        ListNode tmp=null,TMP=null;
        int i=2;
        if(k>2){
            while (i<k)
            if(flag==-1){
                tmp=Merge_Two_Sorted_List.mergeTwoLists(lists[0],lists[1]);
                flag=1;
            }else {
                if(flag==1){
                    TMP=Merge_Two_Sorted_List.mergeTwoLists(tmp,lists[i]);
                    flag=0;
                    i++;
                }else {
                    TMP=Merge_Two_Sorted_List.mergeTwoLists(TMP,lists[i]);
                    i++;
                }
            }
        }
        return TMP;
    }
}
