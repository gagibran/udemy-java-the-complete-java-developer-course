public class Main {
    public static void main(String[] args) {

        // While loop:
        int count = 0;
        while (count != 5) {
            System.out.println(count);
            count++;
        }
        System.out.println("\n\n\n");
        count = 0;
        while (true) {
            System.out.println(count);
            count ++;
            if (count == 5) {
                break;
            }
        }
        System.out.println("\n\n\n");

        // While-do loop:
        count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count != 5);
        System.out.println("\n\n\n");
        count = 5;
        do {
            System.out.println(count);
            count++;
            if (count >= 30) {
                break;
            }
        } while (count != 5);
        System.out.println("\n\n\n");

        // Continue keyword:
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("\n\n\n");

        /*
        * Challenge:
        * Make a loop that records the total number of even numbers it has found
        * and break once 5 are found
        * and at the end, display the total number of even numbers found
        *
        * Create a method called isEvenNumber that takes a parameter of type int
        * Its purpose is to determine if the argument passed to the method is
        * an even number or not.
        * return true if an even number, otherwise return false;
        * */
        int i = 30;
        int countEven = 0;
        while (countEven < 5) {
            i++;
            if (isEvenNumber(i)) {
                countEven++;
                System.out.println("Even number: " + i);
            }
        }
    }
    public static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }
}
