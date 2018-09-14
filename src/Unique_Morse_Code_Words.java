import java.util.HashSet;

public class Unique_Morse_Code_Words {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.print(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] tab = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> set=new HashSet<>();
        for(String tmp:words){
            String convert="";
            for(int i=0;i<tmp.length();i++)
                convert+=tab[tmp.charAt(i)-'a'];
            if(!set.contains(convert))
                set.add(convert);
        }
        return set.size();
    }
}
