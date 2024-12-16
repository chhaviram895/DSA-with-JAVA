// How do you find the maximum element in a 2D array?
public class Maximum {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };
        int[] arr3 = { 7, 48, 9 };
        int[][] ans = { arr1, arr2, arr3 };

        int max = 0;
        for (int r = 0; r < ans.length; r++) {
            for (int c = 0; c < ans[r].length; c++) {
                if (ans[r][c] > max) {
                    max = ans[r][c];
                }
            }
        }
        System.out.println(max);
    }
}
