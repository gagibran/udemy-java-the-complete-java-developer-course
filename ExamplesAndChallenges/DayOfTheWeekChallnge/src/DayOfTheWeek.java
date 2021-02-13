/*
* Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
*
* The method should not return any value (hint: void)
*
* Using a switch statement print "Sunday", "Monday", ..., "Saturday" if the int parameter day is 0, 1, ..., 6
* respectively, otherwise it should print "Invalid day".
*
* Bonus:
*    Write a second solution using if then else, instead of using switch.
*    Create a new project in IntelliJ with the  name DayOfTheWeekChallenge
* */

public class DayOfTheWeek {
    private static final String SUNDAY = "Sunday";
    private static final String MONDAY = "Monday";
    private static final String TUESDAY = "Tuesday";
    private static final String WEDNESDAY = "Wednesday";
    private static final String THURSDAY = "Thursday";
    private static final String FRIDAY = "Friday";
    private static final String SATURDAY = "Saturday";
    private static final String INVALID_DAY_MESSAGE = "Invalid day";
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println(SUNDAY);
                break;
            case 1:
                System.out.println(MONDAY);
                break;
            case 2:
                System.out.println(TUESDAY);
                break;
            case 3:
                System.out.println(WEDNESDAY);
                break;
            case 4:
                System.out.println(THURSDAY);
                break;
            case 5:
                System.out.println(FRIDAY);
                break;
            case 6:
                System.out.println(SATURDAY);
                break;
            default:
                System.out.println(INVALID_DAY_MESSAGE);
                break;
        }
    }

    // Bonus:
    public static void printDayOfTheWeekIfElse(int day) {
        if (day == 0) {
            System.out.println(SUNDAY);
        } else if (day == 1) {
            System.out.println(MONDAY);
        } else if (day == 2) {
            System.out.println(TUESDAY);
        } else if (day == 3) {
            System.out.println(WEDNESDAY);
        } else if (day == 4) {
            System.out.println(THURSDAY);
        } else if (day == 5) {
            System.out.println(FRIDAY);
        } else if (day == 6) {
            System.out.println(SATURDAY);
        } else {
            System.out.println(INVALID_DAY_MESSAGE);
        }
    }
}
