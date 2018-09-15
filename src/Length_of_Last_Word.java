public class Length_of_Last_Word {
    public static void main(String[] args){
        String s="Hello world      ";
        System.out.print(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        String[] res=s.split(" ");
        int  right=res.length-1;
        while (right>=0){
            if(res[right].equals(""))
                right--;
            else break;
        }
        return res[right].length();
    }
}
