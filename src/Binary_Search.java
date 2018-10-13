public class Binary_Search {
    public static void main(String[] args) {
//        int[] nums = {-1, 0, 1, 3, 5, 7};
//        int target = 1;
//        int[] nums = {-1, 0, 3, 5, 9, 12};
//        int target = 9;
        int[] nums = {5};
        int target = 5;
        System.out.print(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1] || nums.length < 1)
            return -1;
        int left = 0;
        int right = nums.length;
        while (nums[left] < target) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target)
                right = mid;
            else left = mid;
            if (left + 1 == right)
                break;
        }
        if (nums[left] != target)
            return -1;
        else return left;
    }
}
