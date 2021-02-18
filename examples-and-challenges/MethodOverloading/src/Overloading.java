public class Overloading {

    // This ones work:
    public static int overloadedMethod(int a, int b) {
        return a + b;
    }

    private int overloadedMethod(double a, float b) {

        return (int) (a / b + b * a);
    }

    public int overloadedMethod(double a, double b) {
        System.out.println("a + b test");
        return (int) (a + b);
    }

    public static int overloadedMethod(float a, double b, int c) {
        if (a > b) {
            return c;
        }
        return (int) (a + b);
    }

    // Return type is different. This doesn't work:
//    private double test(String a, double b, char c) {
//        return (int) (a + b);
//    }

    // This one doesn't work either, because the method is already defined with these arguments:
//    public int overloadedMethod(double a, double b) {
//        return a * b % a
//    }

    // A more practical example:
    public static double processingOfNumbers(int a, int b) {
        return a + b;
    }
    public static double processingOfNumbers(double a, double b, double c) {
        return a + b + c;
    }
    public static double processingOfNumbers(double a, double b, int c, int d) {
        return a * b * c * d;
    }
}