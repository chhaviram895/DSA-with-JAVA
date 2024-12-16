// How do you check if two 2D arrays are equal?
public class Equal {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };
        int[] arr3 = { 11, 12, 13, 14, 15 };
        int[][] ans1 = { arr1, arr2, arr3 };

        int[] arr4 = { 1, 2, 3, 4, 5 };
        int[] arr5 = { 6, 7, 8, 9, 10 };
        int[] arr6 = { 11, 12, 13, 14, 15 };
        int[][] ans2 = { arr4, arr5, arr6 };

        boolean flag = true;

        if (ans1.length == ans2.length && ans1[0].length == ans2[0].length) {
            for (int r = 0; r < ans1.length; r++) {
                for (int c = 0; c < ans1[r].length; c++) {
                    if (ans1[r][c] != ans2[r][c]) {
                        flag = false;
                    }
                }
            }
        } else {
            flag = false;
        }
        System.out.println(flag);
    }
}
