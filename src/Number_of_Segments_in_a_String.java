public class Number_of_Segments_in_a_String {
    public static void main(String[] args) {
//        String s = " , , , ,        a, eaefa ";
//        String s="";
        String s="Of all the gin joints in all the towns in all the world,   ";
        System.out.print(countSegments(s));
    }

    public static int countSegments(String s) {
        int count=0;
        String[] res = s.split(" ");
        for (int i = 0; i < res.length; i++) {
            if (!res[i].equals(""))
                count++;
        }
        return count;
    }
}
