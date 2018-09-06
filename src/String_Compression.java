import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class String_Compression {
    public static void main(String[] args) {
        char[] chars={'a','a','b','b','c','c','c'};
        System.out.print(compress(chars));
    }

    public static int compress(char[] chars) {
//        HashMap<Character,Integer> map=new HashMap<>();
//        for(int i=0;i<chars.length;i++){
//            if(!map.containsKey(chars[i]))
//                map.put(chars[i],1);
//            else{
//                int c=map.get(chars[i]);
//                map.put(chars[i],c+1);
//            }
//        }
//        int count=map.size();
//        Collection<Integer> values=map.values();
//        Iterator<Integer> iterator=values.iterator();
//        while (iterator.hasNext()){
//            int tmp=iterator.next();
//            if(tmp>1)
//                count+=String.valueOf(tmp).length();
//        }
//        return count;
        Arrays.sort(chars);
        int count=0;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]!=chars[i+1])
                count++;
        }

    }
}
