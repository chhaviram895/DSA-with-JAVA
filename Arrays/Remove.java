// How do you remove an element from an array in Java?

import java.util.Scanner;
public class Remove {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        int[] arr = { 1, 2, 3,  5, 6, 7, 7 };
        System.out.println("Enter an no...");
        int n = ram.nextInt(), x = 0;
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != n) {
                ans[x] = arr[i];
                x++;
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
