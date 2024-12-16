// How do you copy the contents of one 2D array to another?
public class Contents {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };
        int[] arr3 = { 11, 12, 13, 14, 15 };
        int[][] ans1 = { arr1, arr2, arr3 };

        int[][] ans2 = new int[ans1.length][ans1[0].length];
        for (int r = 0; r < ans1.length; r++) {
            for (int c = 0; c < ans1[r].length; c++) {
                ans2[r][c] = ans1[r][c];
                System.out.print(ans2[r][c] + " ");
            }
            System.out.println();
        }
    }
}
