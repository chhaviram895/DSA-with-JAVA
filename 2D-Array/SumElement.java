// How do you find the sum of all elements in a 2D array?
public class SumElement {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };
        int[] arr3 = { 7, 8, 9 };
        int[][] ans = { arr1, arr2, arr3 };

        int sum = 0;
        for (int r = 0; r < ans.length; r++) {
            for (int c = 0; c < ans[r].length; c++) {
                sum += ans[r][c];
            }
        }
        System.out.println(sum);
    }
}
