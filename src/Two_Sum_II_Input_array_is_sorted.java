import java.util.HashMap;

public class Two_Sum_II_Input_array_is_sorted {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(numbers, target)[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res[] = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                res[0] = map.get(target - numbers[i]);
                res[1] = i + 1;
                break;
            }
            if (!map.containsKey(numbers[i]))
                map.put(numbers[i], i + 1);
        }
        System.out.println(res[0]);
//        System.out.println(res[1]);
        return res;
    }
}
