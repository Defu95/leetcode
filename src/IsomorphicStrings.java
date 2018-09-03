import java.util.ArrayList;
import java.util.List;

public class IsomorphicStrings {
    public static void main(String[] args){
        String s="paper";
        String t="title";
        boolean res=isIsomorphic(s,t);
        System.out.print(res);
    }

    public static boolean isIsomorphic(String s, String t) {
        List list1=new ArrayList();
        List list2=new ArrayList();
        for(int i=0;i<s.length();i++){
            if(!list1.contains(s.charAt(i)))
                list1.add(s.charAt(i));
            if(!list2.contains(t.charAt(i)))
                list2.add(t.charAt(i));
        }
        System.out.println(list1);
        System.out.println(list2);
        if (list1.size()!=list2.size())
            return false;
        int l=s.length();
        int[] a= new int[l];
        int[] b= new int[l];
        for(int i=0;i<s.length();i++){
            a[i]= list1.indexOf(s.charAt(i));
            b[i]= list2.indexOf(t.charAt(i));
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }
}
