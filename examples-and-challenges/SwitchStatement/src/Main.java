import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Using if-else statement:
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was neither 1 or 2");
        }

        // Using switch statement:
        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4, or 5");
                break;
            default:
                System.out.println("Value was neither 1 or 2");
                break;
        }
        /*
         * CHALLENGE:
         * Create a new switch statement using char instead of int
         * create a new char variable
         * create a switch statement testing for
         * A, B, C, D, or E
         * display a message if any of these are found and then break
         * Add a default which displays a message saying not found
         * */
        char myChar = 'D';
        switch (myChar) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D':
                System.out.println("D was found");
                break;
            case 'E':
                System.out.println("E was found");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        // With strings:
        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Jan or Jun");
                break;
        }
    }
}
