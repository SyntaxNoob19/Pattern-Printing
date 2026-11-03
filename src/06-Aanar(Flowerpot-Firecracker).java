class Main {
    public static void main(String[] args) {

        int n = 7;
        int mid = n / 2;

        // Part 1: Explosion
        for (int i = 0; i <= mid; i++) {

            for (int j = 0; j < 2 * n - 1; j++) {

                if (i == mid && j == 2 * mid) {
                    System.out.print("* ");
                }
                else if (i == mid) {
                    System.out.print("_ ");
                }
                else if (j == 2 * mid) {
                    System.out.print("| ");
                }
                else if (j == 2 * i) {
                    System.out.print("\\ ");
                }
                else if (j == 2 * n - 2 - 2 * i) {
                    System.out.print("/ ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // Part 2: Filled inverted triangle (Cone)
        for (int i = 0; i < mid+2; i++) {

            for (int j = 0; j < 2 * n - 1; j++) {

                if (j >= 2 * mid - i && j <= 2 * mid + i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
