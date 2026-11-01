// method 1
class Main {
    public static void main(String[] args) {

        int n = 15;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                // Inverted triangle
                boolean inverted =
                    (j == i || j == i + 1);

                // Upright triangle
                boolean upright =
                    (j == n - 1 - i || j == n - 2 - i);

                // Remove bottom corner stars
                boolean bottom =
                    (i == n - 1 && (j == 0 || j == n - 1));

                if ((inverted || upright) && !bottom) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }


  //method 2
class Main {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                 if (
                !(i == n - 1 && (j == 0 || j == n - 1)) &&
                    (j == i || j == i + 1 ||
                     j == n - 1 - i || j == n - 2 - i)) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
}
