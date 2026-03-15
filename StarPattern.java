public class StarPattern {
    public static void main(String[] args) {
        private final int N = 5;

        for (int i = 1; i <= 2 * N - 1; i++) {

            int row = i <= N ? i : 2 * N - i;

            for (int j = row; j < N; j++) {
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
