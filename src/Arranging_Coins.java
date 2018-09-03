public class Arranging_Coins {
    public static void main(String[] args){
        System.out.print(arrangeCoins(5));
    }
    public static int arrangeCoins(int n) {
        int i=1;
        while (n>0){
            n=n-i;
            i++;
            if(n<i)
                break;
            if(n==i)
                return i;
        }
        return i-1;
    }
}
