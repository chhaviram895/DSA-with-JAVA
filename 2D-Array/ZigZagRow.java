// Print in Zig - Zag form in Row.
public class ZigZagRow {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };
        int[] arr3 = { 7, 8, 9 };
        int[][] ans1 = { arr1, arr2, arr3 };

        for (int r = 0; r < ans1.length; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < ans1[0].length; c++) {
                    System.out.print(ans1[r][c] + " ");
                }
            } else {
                for (int c = ans1[0].length - 1; c >= 0; c--) {
                    System.out.print(ans1[r][c] + " ");
                }
            }

            System.out.println();
        }
    }
}