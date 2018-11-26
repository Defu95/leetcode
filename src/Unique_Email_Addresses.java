import java.util.HashSet;

public class Unique_Email_Addresses {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.print(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String str : emails) {
            set.add(normalize(str));
        }
        return set.size();
    }

    public static String normalize(String str) {
        StringBuffer sb = new StringBuffer();
        int flag = -1;
        for (int i = 0; i < str.length(); i++) {
            if (flag == 1)
                sb.append(str.charAt(i));
            else {
                if (flag == 0) {
                    if (str.charAt(i) != '@')
                        continue;
                    else {
                        flag = 1;
                        sb.append(str.charAt(i));
                    }
                } else {
                    if (str.charAt(i) == '.')
                        continue;
                    if (str.charAt(i) == '+') {
                        flag = 0;
                        continue;
                    }
                    if (str.charAt(i) == '@') {
                        flag = 1;
                        sb.append(str.charAt(i));
                    } else {
                        sb.append(str.charAt(i));
                    }
                }
            }
        }
        return sb.toString();
    }
}
