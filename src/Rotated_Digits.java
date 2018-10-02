import java.util.ArrayList;
import java.util.List;

public class Rotated_Digits {
    public static void main(String[] args) {
        System.out.print(rotatedDigits(10));
    }
    public static int rotatedDigits(int N) {
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=N;i++){
            String s=String.valueOf(i);
            int flag=-1;
            String tmp="";
            for(int j=0;j<s.length();j++){
                int k=rotate(s.charAt(j));
                if(k==10){
                    flag=1;
                    break;
                }else
                    tmp+=String.valueOf(k);
            }
            if(flag==-1&&Integer.parseInt(tmp)!=i)
                res.add(Integer.parseInt(s));
        }
        return res.size();
    }
    public static int rotate(char ch){
        int n=ch-'0';
        if(n==0||n==1||n==8)
            return n;
        else if(n==2||n==5)
            return 10/n;
        else if(n==6||n==9)
            return 54/n;
        else return 10;
    }
}