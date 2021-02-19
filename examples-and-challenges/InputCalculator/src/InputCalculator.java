import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                sum += scanner.nextInt();
                count++;
            } else {
                double avg = (double) sum / count;
                System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
                break;
            }
        }
        scanner.close();
    }
}
