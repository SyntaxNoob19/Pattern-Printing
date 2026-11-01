class Main {
    public static void main(String[] args) {

int n = 11;
int mid = n / 2;

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {

boolean part1 = (j == 0 && i <= mid) ||
              (i == mid) ||
              (j == n-1 && i >= mid);

boolean part2 = (i == 0 && j >= mid) ||
                (j == mid) ||
                (i == n-1 && j <= mid);

if (part1 || part2) {
    System.out.print("*  ");
} else {
    System.out.print("   ");
}

    }
    System.out.println();
        
        }
    }
}
