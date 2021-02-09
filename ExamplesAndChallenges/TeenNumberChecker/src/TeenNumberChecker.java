public class TeenNumberChecker {
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        return (ageOne >= 13 && ageOne <= 19) || (ageTwo >= 13 && ageTwo <= 19) || (ageThree >= 13 && ageThree <= 19);
    }
    public static boolean isTeen (int age) {
        return age >= 13 && age <= 19;
    }
}
