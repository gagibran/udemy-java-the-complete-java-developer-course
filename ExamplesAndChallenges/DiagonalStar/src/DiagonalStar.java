public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int column = 0; column < number; column++) {
                for (int row = 0; row < number; row++) {
                    if (column == row) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
