import java.util.HashSet;

public class Distribute_Candies {
    public static void main(String[] args) {
        int[] candies = {1, 1, 2, 2, 3, 4};
        System.out.print(distributeCandies(candies));
    }

    public static int distributeCandies(int[] candies) {
        int num=candies.length/2;
        HashSet<Integer> set = new HashSet<>();
        for (int a : candies)
            set.add(a);
        if(set.size()>=num)
            return num;
        else
            return set.size();
    }
}
