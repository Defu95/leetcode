import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {3, 1, 2};
//        int[] nums2={1};
        int[] nums2 = {};
        int[] res = intersection(nums1, nums2);
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> res = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for (int a : nums1) {
            set.add(a);
        }
        for (int b : nums2)
            if (set.contains(b))
                res.add(b);
        int[] section = new int[res.size()];
        int k = 0;
        Iterator<Integer> iterator = res.iterator();
        while (iterator.hasNext()) {
            Integer it = iterator.next();
            section[k] = it;
            k++;
        }
        return section;
    }
}
