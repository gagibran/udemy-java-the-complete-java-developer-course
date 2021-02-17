public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        for (int i = number - 1; i >= 2; i--) {
            boolean isPrime = true;
            if (number % i == 0) {
                for (int j = i / 2; j >= 2; j--) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                    isPrime = true;
                }
                if (isPrime) {
                    return i;
                }
            }
        }
        return number;
    }
}
