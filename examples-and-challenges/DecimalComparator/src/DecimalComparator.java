public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble) {
        int scaledFirstDouble = (int) (firstDouble * 1000);
        int scaledSecondDouble = (int) (secondDouble * 1000);
        return scaledFirstDouble == scaledSecondDouble;
    }
}
