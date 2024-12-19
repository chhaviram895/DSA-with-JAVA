// How do you find the row with the SmallestRow sum in a 2D array?

import java.util.Arrays;

public class SmallestRow {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };
        int[] arr3 = { 7, 8, 9 };
        int[][] ans1 = { arr1, arr2, arr3 };

        int minSum = Integer.MAX_VALUE;
        int row = -1;
        for (int r = 0; r < ans1.length; r++) {
            int sum = 0;
            for (int c = 0; c < ans1[r].length; c++) {
                sum += ans1[r][c];
            }
            if (minSum > sum) {
                minSum = sum;
                row = r;
            }
        }
        System.out.println(Arrays.toString((ans1[row])));
    }
}
