import java.util.HashMap;

public class Word_Pattern {
    public static void main(String[] args){
        String pattern = "aba", str = "dog cat cat";
        System.out.print(wordPattern(pattern,str));

    }

    public static boolean wordPattern(String pattern, String str) {
        String[] split=str.split(" ");
        if(pattern.length()!=split.length)
            return false;
        HashMap<Character,Integer> set1=new HashMap<>();
        HashMap<String,Integer> set2=new HashMap<>();
        int m=1,n=1;
        for(int i=0;i<pattern.length();i++){
            if(!set1.containsKey(pattern.charAt(i))){
                set1.put(pattern.charAt(i),m);
                m++;
            }
        }
        for(int i=0;i<split.length;i++){
            if(!set2.containsKey(split[i])){
                set2.put(split[i],n);
                n++;
            }
        }
        if(m!=n)
            return false;
        for(int i=0;i<split.length;i++){
            if(set1.get(pattern.charAt(i))!=set2.get(split[i]))
                return false;
        }
        return true;
    }
}
