public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return barking && hourOfDay >= 0 && hourOfDay <= 23 && (hourOfDay < 8 || hourOfDay > 22);
    }
}
