public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        while (a > 0) {
            int lastDigitA = a % 10;
            int compareB = b;
            while (compareB > 0) {
                int lastDigitB = compareB % 10;
                if (lastDigitA == lastDigitB) {
                    return true;
                }
                compareB /= 10;
            }
            a /= 10;
        }
        return false;
    }
}
