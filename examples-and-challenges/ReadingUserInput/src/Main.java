import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean isInt = scanner.hasNextInt();
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // Handling the "next line" character. No variables assigned.
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println(name);
        if (isInt && yearOfBirth >= 0 && yearOfBirth <= 2021) {
            System.out.println(2021 - yearOfBirth);
        } else {
            System.out.println("Invalid year.");
        }
    }
}
