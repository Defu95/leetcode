import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] res = intersect(nums1, nums2);
        for (int i : res)
            System.out.print(i + " ");
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : nums1) {
            if (map.containsKey(a))
                map.put(a, map.get(a) + 1);
            else
                map.put(a, 1);
        }
        List<Integer> tmp = new ArrayList<>();
        for (int b : nums2) {
            if (map.containsKey(b) && map.get(b) >= 1) {
                map.put(b, map.get(b) - 1);
                tmp.add(b);
            }
        }
        int[] res = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++)
            res[i] = tmp.get(i);
        return res;
    }
}
