// How do you find the column with the smallest sum in a 2D array?
import java.util.Arrays;
public class SmallestColumn {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int min = Integer.MAX_VALUE;
        int col = -1;

        for (int c = 0; c < arr[0].length; c++) {
            int sum = 0;
            for (int r = 0; r < arr.length; r++) {
                sum += arr[r][c];
                arr[c][r] = arr[r][c];
            }
            if (min > sum) {
                min = sum;
                col = c;
            }
        }
        System.out.println(Arrays.toString(arr[col]));
    }
}
