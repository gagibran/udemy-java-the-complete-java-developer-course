public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int toBeReversed = number;
        if (number < 0) {
            toBeReversed = number * (-1);
        }
        while (toBeReversed > 0) {
            reverse *= 10;
            reverse += toBeReversed % 10;
            toBeReversed /= 10;
        }
        if (number < 0) {
            reverse *= (-1);
        }
        return number == reverse;
    }
}
