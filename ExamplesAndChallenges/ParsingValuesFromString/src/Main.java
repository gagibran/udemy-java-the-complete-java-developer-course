public class Main {
    public static void main(String[] args) {
        String numberAsString = "2018"; // Interpreted as text.
        System.out.println(numberAsString);
        int number  = Integer.parseInt(numberAsString); // Parsing it as a string.
        System.out.println(numberAsString + 1); // String concatenation: converts 1 into string.
        System.out.println(number + 1); // Number addition.

        // For a double:
        numberAsString = "2018.123"; // Interpreted as text.
        double numberDouble  = Double.parseDouble(numberAsString); // Parsed as double.
        System.out.println(numberDouble - 122.2);
    }
}
