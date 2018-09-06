public class String_Compression {
    public static void main(String[] args) {
//        String s = " , , , ,        a, eaefa ";
        String s="";
//        String s="Of all the gin joints in all the towns in all the world,   ";
        System.out.print(countSegments(s));
    }

    public static int countSegments(String s) {
//        if(s.equals(""))
//            return 0;
        int count=0;
//        if(s.charAt(0)==' ')
//            count++;
//        for(int i=1;i<s.length();i++){
//            if(s.charAt(i)==' '&&s.charAt(i-1)==' ')
//                count++;
//        }
//        for(int i=s.length()-1;i>s.length();i--){
//            if(s.charAt(i)==' '&&s.charAt(i-1)==' ')
//                count--;
//            else
//                break;
//        }
        String[] res=s.split(" ");
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
        for(int i=0;i<res.length;i++){
            if(!res[i].equals(""))
                count++;
        }
        return count;
    }
}
