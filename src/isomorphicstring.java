import java.util.HashMap;

public class isomorphicstring {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        boolean res = isisomorphic(s, t);
        System.out.print(res);
    }


    public static boolean isisomorphic(String s, String t) {
        HashMap<String,Integer> map1=new HashMap<String,Integer>();
        HashMap<String,Integer> map2=new HashMap<String,Integer>();
        int m=0,n=0;
        for(int i=0; i<s.length(); i++){
            if(!map1.containsKey(String.valueOf(s.charAt(i)))){
                m++;
                map1.put(String.valueOf(s.charAt(i)),m);
            }
            if(!map2.containsKey(String.valueOf(t.charAt(i)))){
                n++;
                map2.put(String.valueOf(t.charAt(i)),n);
            }
        }
        int[] a=new int[s.length()],b= new int[s.length()];
        for(int i=0;i<s.length();i++){
            a[i]=map1.get(String.valueOf(s.charAt(i)));
            b[i]=map2.get(String.valueOf(t.charAt(i)));
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }
}


