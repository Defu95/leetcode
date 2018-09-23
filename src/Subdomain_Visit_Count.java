import java.util.*;

public class Subdomain_Visit_Count {
    public static void main(String[] args) {
        String[] test = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> res = subdomainVisits(test);
        Iterator<String> iterator = res.iterator();
        while (iterator.hasNext()) {
            String it = iterator.next();
            System.out.println(it + " ");
        }
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : cpdomains) {
            String num = "";
            int i = 0;
            while (str.charAt(i) != ' ') {
                num += str.charAt(i);
                i++;
            }
            int count = Integer.parseInt(num);
            while (i < str.length()) {
                if (str.charAt(i) == '.' || str.charAt(i) == ' ') {
                    String sub = str.substring(i + 1);
                    if (map.containsKey(sub)) {
                        int tmp = map.get(sub);
                        map.put(sub, count + tmp);
                        i++;
                    } else {
                        map.put(sub, count);
                        i++;
                    }
                } else
                    i++;
            }
        }
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String tmp = "";
            tmp = String.valueOf(entry.getValue()) + " " + (String) entry.getKey();
            res.add(tmp);
        }
        return res;
    }
}
