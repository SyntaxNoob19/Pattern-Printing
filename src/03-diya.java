class Main {
    public static void main(String[] args) {

        int n = 4;  // Diamond size
        int t = 7;  // Inverted triangle size

        // Upper half of diamond
        for (int i = 1; i <= n; i++) {

            // Shift diamond towards the center
            for (int s = 1; s <= t - n; s++) {
                System.out.print("  ");
            }

            // Leading spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }

            // Filled stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half of diamond
        for (int i = n - 1; i >= 1; i--) {

            for (int s = 1; s <= t - n; s++) {
                System.out.print("  ");
            }

            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Large inverted triangle
        for (int k = t; k >= 1; k--) {

            // Leading spaces
            for (int j = 1; j <= t - k; j++) {
                System.out.print("  ");
            }

            // Filled stars
            for (int j = 1; j <= 2 * k - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
