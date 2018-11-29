import java.util.*;

public class Reorder_Log_Files {
    public static void main(String[] args) {
        String[] logs = {"a12 12 12 23", "s2 as sd"};
        String[] res = reorderLogFiles(logs);
        for(String s:res)
            System.out.println(s);
    }

    public static String[] reorderLogFiles(String[] logs) {
        Comparator<String> myComp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int s1si = s1.indexOf(' ');
                int s2si = s2.indexOf(' ');
                char s1fc = s1.charAt(s1si+1);
                char s2fc = s2.charAt(s2si+1);

                if (s1fc <= '9') {
                    if (s2fc <= '9') return 0;
                    else return 1;
                }
                if (s2fc <= '9') return -1;

                int preCompute = s1.substring(s1si+1).compareTo(s2.substring(s2si+1));
                if (preCompute == 0) return s1.substring(0,s1si).compareTo(s2.substring(0,s2si));
                return preCompute;
            }
        };

        Arrays.sort(logs, myComp);
        return logs;
    }
//        List<String> res = new ArrayList<>();
//        List<String> num = new ArrayList<>();
//        PriorityQueue<String> letter = new PriorityQueue<String>();
//        for (String str : logs) {
//            if (isStrDigit(str)) {
//                num.add(str);
//            } else {
//                letter.offer(str);
//            }
//        }
//        while (letter.size() != 0)
//            res.add(letter.poll());
//        res.addAll(num);
//        return res.toArray(new String[res.size()]);
//    }
//
//    public static boolean isStrDigit(String str) {
//        int flag = str.indexOf(' ');
//        return Character.isDigit(str.charAt(flag + 1));
//    }
//
//    public class LetterComparator implements Comparator<String> {
//        public int compare(String str1, String str2) {
//            int f1 = str1.indexOf(' ');
//            int f2 = str2.indexOf(' ');
//            String w1 = str1.substring(f1 + 1);
//            String w2 = str2.substring(f2 + 1);
//
//            int compareStatus = w1.compareTo(w2);   // > return 1 ==return 0 < return -1
//            if (compareStatus == 0) {
//                String wo1 = str1.substring(0, f1);
//                String wo2 = str2.substring(0, f2);
//                return wo2.compareTo(wo1);
//            }
//            return compareStatus;
//        }
//    }
}
