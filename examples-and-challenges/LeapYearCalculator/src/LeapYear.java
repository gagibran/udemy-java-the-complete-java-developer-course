public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else {
                return year % 400 == 0; // If it is evenly divisible by 400, returns ture. Otherwise, returns false.
            }
        }
        return false;
    }
}
