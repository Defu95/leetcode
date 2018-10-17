public class Guess_Number_Higher_or_Lower {
    /* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */
    public static void main(String[] args) {
        System.out.print(guessNumber(10));
    }

    public static int guess(int n) {
        if (n < 6)
            return 1;
        else if (n > 6)
            return -1;
        else
            return 0;
    }

    public static int guessNumber(int n) {
        if (guess(n) == 0)
            return n;
        int left = 1, right = n, mid = left + (right - left) / 2;
        while (guess(mid) != 0) {
            if (guess(mid) == -1) {
                right = mid;
                mid = left + (right - left) / 2;
            } else if (guess(mid) == 1) {
                left = mid;
                mid = left + (right - left) / 2;
            }
        }
        return mid;
    }
}
