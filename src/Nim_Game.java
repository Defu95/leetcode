public class Nim_Game {
    public static void main(String[] args) {
        System.out.println(canWinNim(4));
    }

    public static boolean canWinNim(int n) {
        int res = n % 4;
        return res == 0 ? false : true;
    }
}
