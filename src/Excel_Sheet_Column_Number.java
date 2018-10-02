public class Excel_Sheet_Column_Number {
    public static void main(String[] args){
        System.out.print(titleToNumber("AB"));
    }
    public static int titleToNumber(String s) {
        int len=s.length();
        int num=0;
        for(int i=0;i<len;i++){
            int tmp=s.charAt(i)-'A'+1;
            num+=Math.pow(26,len-i-1)*tmp;
        }
        return num;
    }
}
