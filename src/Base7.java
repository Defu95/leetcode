public class Base7 {
    public static void main(String[] args){
        System.out.print(convertToBase7(1));
    }

    public static String convertToBase7(int num) {
        String res="";
        int flag=-1;
        if(num<0){
            num*=flag;
            flag=1;
        }
        while (num/7!=0){
            res=Integer.toString(num%7)+res;
            num/=7;
        }
        if(num%7!=0)
            res=Integer.toString(num)+res;
        return flag==1 ? "-"+res : res;
    }
}
