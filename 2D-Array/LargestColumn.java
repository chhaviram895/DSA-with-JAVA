
// How do you find the column with the largest sum in a 2D array?
import java.util.Arrays;

public class LargestColumn {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        int max = Integer.MIN_VALUE;
        int ans = -1;
        for (int c = 0; c < arr[0].length; c++) {
            int sum = 0;
            for (int r = 0; r < arr.length; r++) {
                sum += arr[r][c];
                arr[c][r] = arr[r][c];
            }
            if (max < sum) {
                max = sum;
                ans = c;
            }

        }
        System.out.println(Arrays.toString(arr[ans]));

    }
}
