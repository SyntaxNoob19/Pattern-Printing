class Square {
    public static void main(String[] args) {
        int wingSize = 5;       // Size of outer square wings
        int diamondSize = 9;    // Size of the center diamond box

        top_bottom(wingSize, diamondSize);
        center(wingSize, diamondSize);
        top_bottom(wingSize, diamondSize);
    }

    static void top_bottom(int wing, int centerGap) {
        for (int i = 1; i <= wing; i++) {
            // Left wing
            for (int j = 1; j <= wing; j++) {
                System.out.print("*  ");
            }
            // Gap matching the center box width exactly
            for (int j = 1; j <= centerGap; j++) {
                System.out.print("   ");
            }
            // Right wing
            for (int j = 1; j <= wing; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    static void center(int wing, int m) {
        int mid = m / 2; // Center row/col of the diamond box (4 for m=9)

        for (int i = 0; i < m; i++) {
            // 1. Indent matching left wing width exactly
            for (int j = 1; j <= wing; j++) {
                System.out.print("   ");
            }

            // 2. Center floating diamond box (m x m)
            for (int j = 0; j < m; j++) {
                boolean isSquare = (i == 0 || i == m - 1 || j == 0 || j == m - 1);

                // 4 Slanted diamond edges shifted 1 unit inward
                boolean topLeft     = (i <= mid && j <= mid && i + j == mid + 1);
                boolean topRight    = (i <= mid && j >= mid && j - i == mid - 1);
                boolean bottomLeft  = (i >= mid && j <= mid && i - j == mid - 1);
                boolean bottomRight = (i >= mid && j >= mid && i + j == 3 * mid - 1);

                if (isSquare || topLeft || topRight || bottomLeft || bottomRight) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }

            
            System.out.println();
        }
    }
}
