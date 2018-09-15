public class Hamming_Distance {
    public static void main(String[] args){
        System.out.println(hammingDistance(1,4));
    }
    public static int hammingDistance(int x, int y) {
        int a=Math.max(x,y);
        int b=Math.min(x,y);
        String s = Integer.toBinaryString(a);
        String t = Integer.toBinaryString(b);
        while (s.length()!=t.length())
            t="0"+t;
        int count=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)!=t.charAt(i))
                count++;
        return count;
    }
}
