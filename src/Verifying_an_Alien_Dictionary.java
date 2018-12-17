public class Verifying_an_Alien_Dictionary {
    public static void main(String[] args){
//        String[] words = {"hello","leetcode"};
//        String order = "hlabcdefgijkmnopqrstuvwxyz";
//        String[] words = {"word","world","row"};
//        String order = "worldabcefghijkmnpqstuvxyz";
        String[] words = {"apple","app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words,order));
    }
    public static boolean isAlienSorted(String[] words, String order) {
        if(words.length<=1)
            return true;
        for(int i=1;i<words.length;i++){
            if(cmp(words[i-1],words[i],order)==false)
                return false;
            else
                continue;
        }
        return true;
    }

    public static boolean cmp(String w1,String w2,String order){
        int lw1=w1.length(),lw2=w2.length();
        int len=Math.min(lw1,lw2);
        for(int i=0;i<len;i++){
                if(order.indexOf(w1.charAt(i))<order.indexOf(w2.charAt(i)))
                    return true;
                else if(order.indexOf(w1.charAt(i))==order.indexOf(w2.charAt(i)))
                    continue;
                else
                    return false;
            }
        return lw1>lw2?false:true;
    }
}
