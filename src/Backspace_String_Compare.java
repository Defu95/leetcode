import java.util.Stack;

public class Backspace_String_Compare {
    public static void main(String[] args) {
//        String S = "ab#c", T = "ad#c";
        String S = "xywrrmp", T = "xywrrmu#p";
        System.out.print(backspaceCompare(S, T));
    }

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = tost(S);
        Stack<Character> stack2 = tost(T);
        if (stack1.size() != stack2.size())
            return false;
        for (int i = 0; i < stack1.size(); i++) {
            char ch1 = stack1.peek();
            char ch2 = stack2.peek();
            if (ch1 != ch2)
                return false;
        }
        return true;
    }

    public static Stack<Character> tost(String S) {
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#') {
                if (!stack1.isEmpty())
                    stack1.pop();
            } else
                stack1.push(S.charAt(i));
        }
        return stack1;
    }
}
