import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Baseball_Game {
    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};
//        String[] ops={"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints1(ops));
    }

    public static int calPoints(String[] ops) {
        Stack<Integer> st=new Stack<>();
        for(String s:ops){
            switch (s){
                case "C":
                    st.pop();
                    break;
                case "D":
                    st.push(st.peek()*2);
                    break;
                case "+":
                    st.push(st.peek()+st.get(st.size()-2));
                    break;
                default:
                    st.push(Integer.parseInt(s));
            }
        }
        int count=0;
        while (!st.empty()){
            count+=st.peek();
            st.pop();
        }
        return count;
    }

    //本地可以运行，但是在leetcode编译结果与本地不同
    public static int calPoints1(String[] ops) {
        int count = 0;
        List<Integer> score = new ArrayList<>();
        for (String s: ops) {
            if (s.equals("C")) {
                count -= score.get(score.size() - 1);
                score.remove(score.size() - 1);
            }
            else if (s.equals("D")) {
                score.add(2 * score.get(score.size() - 1));
                count += score.get(score.size() - 1);
            }
            else if (s.equals("+")) {
                int tmp = score.get(score.size() - 1) + score.get(score.size() - 2);
                score.add(tmp);
                count += tmp;
            }
            else{
                count += Integer.parseInt(s);
                score.add(Integer.parseInt(s));
            }
        }
        return count;
    }
//    public static boolean isnum(String s) {
//        Pattern pattern = Pattern.compile("-?[0-9]+\\.?[0-9]*");
//        Matcher isNum = pattern.matcher(s);
//        if (!isNum.matches())
//            return false;
//        return true;
////        for (int i = 0; i < s.length(); i++)
////            if (s.charAt(i) < '0' || s.charAt(i) > '9')
////                return false;
////        return true;
//    }
}
