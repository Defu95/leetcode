import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Minimum_Index_Sum_of_Two_Lists {
    public static void main(String[] args) {
//        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
//        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};
        String[] res = findRestaurant(list1, list2);
        for (String s : res)
            System.out.print(s + " ");
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        int index = Integer.MAX_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < list1.length; i++)
            map.put(list1[i], i);
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                if (map.get(list2[j]) + j < index) {
                    index = map.get(list2[j]) + j;
                    tmp.clear();
                    tmp.add(list2[j]);
                } else if (map.get(list2[j]) + j == index) {
                    tmp.add(list2[j]);
                }
            }
        }
        String[] res = new String[tmp.size()];
        for (int i = 0; i < tmp.size(); i++)
            res[i] = tmp.get(i);
        return res;
    }
}
