// Print the array column wise .
public class ColumnWise {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };
        int[] arr3 = { 11, 12, 13, 14, 15 };
        int[][] ans1 = { arr1, arr2, arr3 };

        for (int c = 0; c < ans1[0].length; c++) {
            for (int r = 0; r < ans1.length; r++) {
                System.out.print(ans1[r][c] + " ");
            }
            System.out.println();
        }
    }
}