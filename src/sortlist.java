public class sortlist {
    public static void main(String[] args){
        int[] arr={1,3,5,9,6};
        ListNode head=Sort_List.createLinkedList(arr,5);
        ListNode res=sort(head);
        while(res!=null){
            System.out.print(res.val+", ");
            res = res.next;
        }
    }
    public static ListNode sort(ListNode head){
        ListNode p=head;
        int count=0;
        while(p!=null){
            count++;
            p=p.next;
        }
        int[] tmp=new int[count];
        int i=0;
        while(head!=null){
            tmp[i]=head.val;
            i++;
            head=head.next;
        }
        qsort(tmp,0,tmp.length-1);
        ListNode result=Sort_List.createLinkedList(tmp,tmp.length);
        return result;
    }
    private static void qsort(int[] arr, int low, int high){
        if (low < high){
            int pivot=partition(arr, low, high);        //将数组分为两部分
            qsort(arr, low, pivot-1);                   //递归排序左子数组
            qsort(arr, pivot+1, high);                  //递归排序右子数组
        }
    }
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];     //枢轴记录
        while (low<high){
            while (low<high && arr[high]>=pivot) --high;
            arr[low]=arr[high];             //交换比枢轴小的记录到左端
            while (low<high && arr[low]<=pivot) ++low;
            arr[high] = arr[low];           //交换比枢轴小的记录到右端
        }
        //扫描完成，枢轴到位
        arr[low] = pivot;
        //返回的是枢轴的位置
        return low;
    }
}
