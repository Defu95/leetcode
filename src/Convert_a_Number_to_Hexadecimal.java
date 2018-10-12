public class Convert_a_Number_to_Hexadecimal {
    public static void main(String[] args) {
        System.out.print(toHex(-1));
    }

    public static String toHex(int num) {
        if(num==0)
            return "0";
        char[] ch="0123456789abcdef".toCharArray();
        String res="";
        int i=1;
        while(num!=0&&i<=8){
            res=ch[num&15]+res;
            num>>=4;
            i++;
        }
        return res;
    }
}
