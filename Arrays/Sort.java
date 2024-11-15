// How do you sort an array in Java?

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 11,12,44,5, 4, 3, 2, 1 };

        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr);
            System.out.print(arr[i] + " ");
        }
    }
}
