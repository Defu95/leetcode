public class Reverse_String_II {
    public static void main(String[] args){
        String s="abcd";
        int k = 2;
        System.out.print(reverseStr(s,k));
    }
    public static String reverseStr(String s, int k) {
        String res="";
        int i=0,l=s.length();
        for(;i+2*k<l;){
            String tmp=s.substring(i,i+2*k);
            res+=subreverse(tmp,k);
            i+=2*k;
        }
        if(l-i<k)
            res+=new StringBuffer(s.substring(i)).reverse().toString();
        if(l-i>=k&&l-i<=2*k)
            res+=subreverse(s.substring(i),k);
        return res;

    }
    public static String subreverse(String s,int k){
        String st=new StringBuffer(s.substring(0,k)).reverse().toString();
        return st+s.substring(k);
    }
}
