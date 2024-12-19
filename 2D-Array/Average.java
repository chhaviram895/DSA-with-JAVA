// How do you find the average value of all elements in a 2D array?
public class Average {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };
        int[] arr3 = { 7, 8, 9 };
        int[][] ans1 = { arr1, arr2, arr3 };

        int sum = 0;
        for (int r = 0; r < ans1.length; r++) {
            for (int c = 0; c < ans1[r].length; c++) {
                sum += ans1[r][c];
            }
        }
        System.out.println("Total---> " + sum);
        int avg = sum / (ans1.length * ans1[0].length);
        System.out.println("Avg---> " + avg);
    }
}
