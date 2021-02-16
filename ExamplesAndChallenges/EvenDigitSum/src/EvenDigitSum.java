public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int currentDigit = 0;
        int sum = 0;
        while (number > 0) {
            currentDigit = number % 10;
            if (currentDigit % 2 == 0) {
                sum += currentDigit;
            }
            number /= 10;
        }
        return sum;
    }
}
