public class StarPattern {
    public static void main(String[] args) {
        final int SIZE = 5; //Size for pattern creation.

        for (int i = 1; i <= 2 * SIZE - 1; i++) {

            int row = i <= SIZE ? i : 2 * SIZE - i;

            for (int j = row; j < SIZE; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (row > 1) {
                for (int j = 1; j <= 2 * row - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
