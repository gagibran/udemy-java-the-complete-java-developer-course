public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reversedNumber = reverse(number);
        int numberOfDigits = getDigitCount(number);
        int numberOfDigitsReversed = getDigitCount(reversedNumber);
        int howManyZeros = numberOfDigits - numberOfDigitsReversed;
        while (reversedNumber > 0) {
            int digit = reversedNumber % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
            reversedNumber /= 10;
        }
        for (int i = 0; i < howManyZeros; i++) {
            System.out.println("Zero");
        }
        if (number == 0) {
            System.out.println("Zero");
        }
    }
    public static int reverse(int number) {
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
        return reverse;
    }
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        if (number == 0) {
            count = 1;
        }
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
