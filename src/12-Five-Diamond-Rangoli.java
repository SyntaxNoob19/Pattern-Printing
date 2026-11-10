readme public class Main {
    public static void main(String[] args) {
        int n = 3; // Small diamond 
        int m = 5; // Big center diamond 

        // 1ST ROW BLOCK: space -> diamond -> space
        for (int i = 1; i < 2 * n; i++) {
            space(2 * n - 1);      // Left space block
            space(m - n);          // Extra padding to align with big center diamond
            diamond(i, n);         // Top Diamond
            space(m - n);          // Extra padding
            space(2 * n - 1);      // Right space block
            System.out.println();
        }

        // 2ND ROW BLOCK: diamond -> center_diamond -> diamond
        int offset = m - n; // Centers the small diamonds against the big diamond
        for (int i = 1; i < 2 * m; i++) {
            diamond(i - offset, n); // Left small diamond
            diamond(i, m);          // Big center diamond 
            diamond(i - offset, n); // Right small diamond
            System.out.println();
        }

        // 3RD ROW BLOCK: space -> diamond -> space
        for (int i = 1; i < 2 * n; i++) {
            space(2 * n - 1);      // Left space block
            space(m - n);          // Extra padding
            diamond(i, n);         // Bottom Diamond
            space(m - n);          // Extra padding
            space(2 * n - 1);      // Right space block
            System.out.println();
        }
    }

    // Prints 'width' blank spaces on the CURRENT line 
    static void space(int width) {
        for (int j = 1; j <= width; j++) {
            System.out.print("  ");
        }
    }

    // Prints ONLY row 'i' of a solid diamond of size 'size' on the CURRENT line
    static void diamond(int i, int size) {
        int totalWidth = 2 * size - 1;

        // If 'i' is outside the vertical height of the small diamond, fill with blank space
        if (i < 1 || i >= 2 * size) {
            space(totalWidth);
            return;
        }

        // Convert bottom half row index to match top half symmetry
        int row = (i <= size) ? i : (2 * size - i);

        // 1. Left inner spaces of the diamond
        space(size - row);

        // 2. Solid Stars
        for (int j = 1; j <= 2 * row - 1; j++) {
            System.out.print("* ");
        }

        // 3. Right inner spaces of the diamond
        space(size - row);
    }
}'
