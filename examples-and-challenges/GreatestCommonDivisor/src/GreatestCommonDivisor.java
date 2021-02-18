public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        for (int i = first; i > 0; i--) {
            if (first % i == 0) {
                for (int j = second; j > 0; j--) {
                    if (second % j == 0 && i == j) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
