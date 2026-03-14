public class StarPattern {
    public static void main(String[] args) {
        int n = 4; // Distance from center to vertex
        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                // The absolute sum defines the diamond boundary
                if (Math.abs(i) + Math.abs(j) == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
