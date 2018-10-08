import java.util.HashMap;

public class Ransom_Note {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.print(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int rl = ransomNote.length(), ml = magazine.length();
        if (rl > ml)
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ml; i++) {
            if (map.containsKey(magazine.charAt(i)))
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            else
                map.put(magazine.charAt(i), 1);
        }
        for (int i = 0; i < rl; i++) {
            if (!map.containsKey(ransomNote.charAt(i)))
                return false;
            else {
                if (map.get(ransomNote.charAt(i)) == 0)
                    return false;
                else
                    map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
            }
        }
        return true;
    }
}
