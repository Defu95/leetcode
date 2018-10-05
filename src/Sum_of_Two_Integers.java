public class Sum_of_Two_Integers {
    public static void main(String[] args) {
        System.out.println(getSum(3, 5));
    }

    public static int getSum(int a, int b) {
        int result = a ^ b; // 按位加
        int carray = (a & b) << 1; // 计算进位
        if (carray != 0) return getSum(result, carray); //判断进位与处理
        return result;
    }
}
