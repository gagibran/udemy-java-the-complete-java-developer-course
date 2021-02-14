public class Main {
    public static void main(String[] args) {
        /*
         * CHALLENGE:
         * Using the for statement, call the calculateInterest method with
         * the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
         * and print the results to the console window.
         *
         * How would you modify the for loop above to do the same thing as
         * shown but to start from 8% and work back to 2%
         *
         * Create a for statement using any range of numbers
         * Determine if the number is a prime number using the isPrime method
         * if it is a prime number, print it out AND increment a count of the
         * number of prime numbers found
         * if that count is 10 exit the for loop
         * hint:  Use the break; statement to exit
         * */

        // First one:
        System.out.println("First challenge:");
        for (int i = 2; i < 9; i++) {
            System.out.println(calculateInterest(10_000.0, i));
        }

        // Second one:
        System.out.println("\nSecond challenge:");
        for (int i = 8; i > 1; i--) {
            System.out.println(calculateInterest(10_000.0, i));
        }

        // Third one:
        System.out.println("\nThird challenge");
        int initialNumber = 10;
        int finalNumber  = 50;
        int primes = 0;
        for (int i = initialNumber; i < finalNumber; i++) {
            if (isPrime(i)) {
                primes++;
                System.out.println(i);
            }
            if (primes == 10) {
                break;
            }
        }
        System.out.println("Number of primes: " + primes);
    }
    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // The first prime is 2.
        }
        /*
        EXPLANATION FOR i <= number/2:
        No number is divisible for numbers that are greater than its half (except for the number itself).
        Example:
        For 1000, no number greater than 500 (and smaller than 1000) divides 1000.
        501, 502, 503, ..., 999 won't divide 1000 and result in an integer.

        With that being said, the algorithm doesn't have to check for numbers greater than number / 2,
        because we know that they won't divide it. We're optimizing the algorithm.

        There are other ways to optimize this algorithm, like using the square root of the number instead of number /2,
        but that's outside the scope of this lesson.
        */
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false; // Returns false if the number is divisible by a number in the range 2 until number/2.
            }
        }
        return true; // If the number is not divisible (i. e. doesn't meet the condition in the if-statement), it's prime.
    }
}
