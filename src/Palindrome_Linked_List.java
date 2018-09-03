import java.util.Stack;

public class Palindrome_Linked_List {
    public static void main(String[] args){
        int[] arr={1,2,3,3,1};
        ListNode test=Sort_List.createLinkedList(arr,arr.length);
        System.out.print(isPalindrome(test));
    }
    public static boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        ListNode len=head;
        int n=0;
        while (len!=null){
            n++;
            len=len.next;
        }
        ListNode slow=head,fast=head.next;
        Stack<Integer> st = new Stack<Integer>();
        while (fast!=null&&fast.next!=null){
                st.push(slow.val);
                slow=slow.next;
                fast=fast.next.next;
        }
        if(n%2!=0)
            slow=slow.next;
        else{
            st.push(slow.val);
            slow=slow.next;
        }
        while(slow!=null){
            int a=slow.val,b=st.pop();
            if(a!=b)
                return false;
            else{
                slow=slow.next;
                }
        }
        if(slow==null)
            return true;
        else return false;
    }
}
