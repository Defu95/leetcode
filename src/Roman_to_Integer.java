import java.util.HashMap;

public class Roman_to_Integer {
    public static void main(String[] args){
//        String s="MCMXCIV";
//        String s="CMXCI";
        String s="MDCXCV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res=0, flag=0;
        for(int i=1;i<s.length();i++){
            if(map.get(s.charAt(i-1))<map.get(s.charAt(i))){
                res+=map.get(s.charAt(i))-map.get(s.charAt(i-1));
                i++;
                if(i==s.length())
                    flag=1;
            }else {
                res+=map.get(s.charAt(i-1));
                flag=0;
            }
        }
        if(flag==0)
            res+=map.get(s.charAt(s.length()-1));
        return res;
    }
}
