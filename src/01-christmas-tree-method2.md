### Christmas Tree — Logic & Formula

**Approach:** Build the tree using three pyramids of increasing heights and a rectangular trunk. Separate methods keep each section organised.

#### 1. Pyramid Logic

- Outer loop (`i`) controls rows.
- Inner loops print leading spaces and stars.
- Stars increase by 2 per row.

**Formulas** (for a pyramid of height `n`):

- Stars: `2 * i - 1`
- Leading spaces: `n - i`
- Base width: `2 * n - 1`

#### 2. What is Offset?

An **offset** is an extra number of spaces added before a pattern to shift it horizontally and align it with other sections.

```java
spaces = height - i + offset;
```

- `height - i` calculates the normal leading spaces.
- `offset` shifts the entire pyramid to the right.

**Example:** For pyramid heights 3 and 7:

- Small base width = `2 * 3 - 1 = 5`
- Large base width = `2 * 7 - 1 = 13`
- Offset = `(13 - 5) / 2 = 4` spaces

This centres the smaller pyramid relative to the larger one, assuming consistent character spacing.

#### 3. Pyramid Method

```java
static void pyramid(int height, int offset) {
    for (int i = 1; i <= height; i++) {
        for (int s = height - i + offset; s > 0; s--) {
            System.out.print(" ");
        }

        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
```

Example calls:

```java
pyramid(3, 4);
pyramid(7, 0);
```

#### 4. Trunk Logic

Use an outer loop for trunk height, then inner loops for leading spaces and stars.

```java
static void trunk() {
    for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= 7; j++)
            System.out.print("  ");

        for (int j = 1; j <= 7; j++)
            System.out.print("* ");

        System.out.println();
    }
}
```

#### 5. Complexity

- **Time:** `O(n²)` for a pyramid of height `n`.
- **Auxiliary space:** `O(1)`.

**Key takeaway:** Derive formulas from row numbers and pattern widths. Use offsets to adjust horizontal alignment, not as arbitrary magic numbers.
